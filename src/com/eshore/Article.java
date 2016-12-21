package com.eshore;
import java.io.Serializable;
public class Article implements Serializable{
	private int art_id;
	private String art_title;
	private String art_title_pic;
	private String art_content;
	private String art_addr_province;
	private String art_addr_city;
	private String art_likes_num;
	private String art_read_num;
	private String art_user_id;
	private String art_post_time;
	private String art_user_name;
	private int art_user_level;
	
	public Article(){}
	
	public int getArt_id() {
		return art_id;
	}
	public void setArt_id(int art_id) {
		this.art_id = art_id;
	}
	public String getArt_title() {
		return art_title;
	}
	public void setArt_title(String art_title) {
		this.art_title = art_title;
	}
	public String getArt_title_pic() {
		return art_title_pic;
	}
	public void setArt_title_pic(String art_title_pic) {
		this.art_title_pic = art_title_pic;
	}
	public String getArt_content() {
		return art_content;
	}
	public void setArt_content(String art_content) {
		this.art_content = art_content;
	}
	public String getArt_addr_province() {
		return art_addr_province;
	}
	public void setArt_addr_province(String art_addr_province) {
		this.art_addr_province = art_addr_province;
	}
	public String getArt_addr_city() {
		return art_addr_city;
	}
	public void setArt_addr_city(String art_addr_city) {
		this.art_addr_city = art_addr_city;
	}
	public String getArt_likes_num() {
		return art_likes_num;
	}
	public void setArt_likes_num(String art_likes_num) {
		this.art_likes_num = art_likes_num;
	}
	public String getArt_read_num() {
		return art_read_num;
	}
	public void setArt_read_num(String art_read_num) {
		this.art_read_num = art_read_num;
	}
	public String getArt_user_id() {
		return art_user_id;
	}
	public void setArt_user_id(String art_user_id) {
		this.art_user_id = art_user_id;
	}
	public String getArt_post_time() {
		return art_post_time;
	}
	public void setArt_post_time(String art_post_time) {
		this.art_post_time = art_post_time;
	}

	public String getArt_user_name() {
		return art_user_name;
	}

	public void setArt_user_name(String art_user_name) {
		this.art_user_name = art_user_name;
	}

	public int getArt_user_level() {
		return art_user_level;
	}

	public void setArt_user_level(int art_user_level) {
		this.art_user_level = art_user_level;
	}
}
