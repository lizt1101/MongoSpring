package com.lzt.entity;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test")
public class CaiNiao {
	
	private String _id;
	private String title;
	private String description;
	private String by;
	private String url;
	private List<String> tags;
	private Integer likes;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Integer getLikes() {
		return likes;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	@Override
	public String toString() {
		return "CaiNiao [_id=" + _id + ", title=" + title + ", description=" + description + ", by=" + by + ", url="
				+ url + ", tags=" + tags + ", likes=" + likes + "]";
	}
	
	

}
