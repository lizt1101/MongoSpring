package com.lzt.dao;

import java.util.List;

import com.lzt.entity.CaiNiao;

public interface CaiNiaoDao extends MongoGenDao<CaiNiao>{
	

	//��ѯ
	public List<CaiNiao> list(Integer likes);
	
	//����
	public int update(String title,String url);
	
	//��ҳ��ѯ
	public List<CaiNiao> findPage(int start,int pagesize);
	
	public int delete(String _id);
}
