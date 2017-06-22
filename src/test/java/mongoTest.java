import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzt.dao.CaiNiaoDao;
import com.lzt.entity.CaiNiao;

public class mongoTest {
	
	private ApplicationContext ac;
	
	private CaiNiaoDao dao;
	
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext("SpringMVC.xml");
		dao = ac.getBean("caiNiaoDao",CaiNiaoDao.class);
	}
	
	@Test
	public void insert(){
		CaiNiao cn = new CaiNiao();
		cn.setBy("�̳�123");
		cn.setDescription("����Ľ̳�123");
		cn.setLikes(210);
		List<String> tags = new ArrayList<String>();
		tags.add("mysql");
		tags.add("nosql");
		tags.add("oracle");
		cn.setTags(tags);
		cn.setTitle("��1");
		cn.setUrl("www.baidu.com");
		System.out.println(cn.toString());
		dao.save(cn);
		
	}
	
	@Test
	public void findList(){
		List<CaiNiao> list = dao.list(105);
		System.out.println("���ϴ�С"+list.size());
		for (CaiNiao caiNiao : list) {
			System.out.println("����"+caiNiao.toString());
		}
	}
	
	@Test
	public void update(){
		int n = dao.update("MongoDB", "www.lzt.com");
		System.out.println("�ܸ�������:"+n);
	}
	@Test
	public void page(){
		List<CaiNiao> list = dao.findPage(1, 3);
		for (CaiNiao caiNiao : list) {
			System.out.println(caiNiao.toString());
		}
	}
	
	@Test
	public void delete(){
		System.out.println(dao.delete("5947923c0ed14ecbdaa9ac66"));
	}

}






