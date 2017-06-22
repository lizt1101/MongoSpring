package com.lzt.dao.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.lzt.dao.CaiNiaoDao;
import com.lzt.entity.CaiNiao;
import com.mongodb.WriteResult;

import javafx.scene.Group;

@Repository("caiNiaoDao")
public class CaiNiaoDaoImpl extends MongoGenDaoImpl<CaiNiao> implements CaiNiaoDao {

	public List<CaiNiao> list(Integer likes) {
		Query query = new Query();
		query.addCriteria(new Criteria("likes").is(likes));
		//query.with(new Sort(new Sort.Order(Sort.Direction.DESC, "_id")));
		return this.mongoTemplate.find(query, CaiNiao.class);
	}

	public int update(String title,String url) {
		Query query = new Query();
		query.addCriteria(Criteria.where("title").is(title));
		Update update = new Update();
		//当没有key值时就增加一个字段
		Map<String,String> map = new HashMap<String, String>();
		map.put("content", "啦啦啦1");
		//当更新内嵌文档时，即一个集合中的字段时，eg：tags.content就可以更新了，没有的话就是插入
		//update.set("tags.content","啦啦啦1");
		update.set("tags.name", "xiaoming");
		update.set("tags.age", 18);
		//updateMulti更新多条，updateFirst更新一条
		WriteResult result = this.mongoTemplate.updateFirst(query, update, CaiNiao.class);
		return result.getN();
	}

	public List<CaiNiao> findPage(int start, int pagesize) {
		/*Integer i = this.mongoTemplate.findAll(CaiNiao.class).size();
		System.out.println("总条数"+i);
		int pagetotal = i%pagesize==0?(i/pagesize):((i/pagesize)+1);
		System.out.println("总页数"+pagetotal);*/
		Query query = new Query();
		query.skip((start-1)*pagesize);
		query.limit(pagesize);
		return this.mongoTemplate.find(query, CaiNiao.class);
	}

	public int delete(String _id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(_id));
		return this.mongoTemplate.remove(query,CaiNiao.class).getN();
	}
	
	
	
	

	
}












