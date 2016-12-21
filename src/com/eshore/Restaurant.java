package com.eshore;

public class Restaurant {
	private int res_id;
	private String res_name;
	private String res_addr_province;
	private String res_addr_city;
	private String res_addr_street;
	private String res_style;
	private int res_average_cost;
	private double res_score;
	private String res_pic;
	private int res_refer_num;
	
	public Restaurant(){}

	public int getRes_id() {
		return res_id;
	}

	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}

	public String getRes_name() {
		return res_name;
	}

	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}

	public String getRes_addr_province() {
		return res_addr_province;
	}

	public void setRes_addr_province(String res_addr_province) {
		this.res_addr_province = res_addr_province;
	}

	public String getRes_addr_city() {
		return res_addr_city;
	}

	public void setRes_addr_city(String res_addr_city) {
		this.res_addr_city = res_addr_city;
	}

	public String getRes_addr_street() {
		return res_addr_street;
	}

	public void setRes_addr_street(String res_addr_street) {
		this.res_addr_street = res_addr_street;
	}

	public String getRes_style() {
		return res_style;
	}

	public void setRes_style(String res_style) {
		this.res_style = res_style;
	}

	public int getRes_average_cost() {
		return res_average_cost;
	}

	public void setRes_average_cost(int res_average_cost) {
		this.res_average_cost = res_average_cost;
	}

	public double getRes_score() {
		return res_score;
	}

	public void setRes_score(double res_score) {
		this.res_score = res_score;
	}
	
	public String getRes_pic() {
		return res_pic;
	}

	public void setRes_pic(String res_pic) {
		this.res_pic = res_pic;
	}
	
	public int getRes_refer_num() {
		return res_refer_num;
	}

	public void setRes_refer_num(int res_refer_num) {
		this.res_refer_num =res_refer_num;
	}
}
