package com.eshore;

import java.io.Serializable;

public class User  implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String tel;
	private String password;
	private int level;
	private int experience;
	private int money;
	private String cert_status;
	private String gender;
	private int birth_year;
	private String reg_time;
	private String bp_city;
	private String bp_province;
	private String lp_city;
	private String lp_province;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getCert_status() {
		return cert_status;
	}
	public void setCert_status(String cert_status) {
		this.cert_status = cert_status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}
	public String getReg_time() {
		return reg_time;
	}
	public void setReg_time(String reg_time) {
		this.reg_time = reg_time;
	}
	public String getBp_city() {
		return bp_city;
	}
	public void setBp_city(String bp_city) {
		this.bp_city = bp_city;
	}
	public String getBp_province() {
		return bp_province;
	}
	public void setBp_province(String bp_province) {
		this.bp_province = bp_province;
	}
	public String getLp_city() {
		return lp_city;
	}
	public void setLp_city(String lp_city) {
		this.lp_city = lp_city;
	}
	public String getLp_province() {
		return lp_province;
	}
	public void setLp_province(String lp_province) {
		this.lp_province = lp_province;
	}
}
