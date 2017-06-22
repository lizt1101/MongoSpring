package com.lzt.dao;

import java.util.List;

import com.lzt.entity.CaiNiao;

public interface CaiNiaoDao extends MongoGenDao<CaiNiao>{
	

	//查询
	public List<CaiNiao> list(Integer likes);
	
	//更新
	public int update(String title,String url);
	
	//分页查询
	public List<CaiNiao> findPage(int start,int pagesize);
	
	public int delete(String _id);
}
