package com.lzt.dao.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.lzt.dao.MongoGenDao;

public class MongoGenDaoImpl<T> implements MongoGenDao<T> {
	
	@Autowired
	protected MongoTemplate mongoTemplate;
	
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	public void save(T t) {	
		this.mongoTemplate.save(t);
	}
	

}
