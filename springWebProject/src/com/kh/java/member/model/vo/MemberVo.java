package com.kh.java.member.model.vo;

import java.util.Date;
import java.util.List;

import com.kh.java.family.model.vo.Family;

public class MemberVo {
	private String userid;
	private String password;
	private String username;
	private String gender;
	private int age;
	private String email;
	private String phone;
	private String address;
	private String hobby;
	private Date enrolldate;
	private List<Family> family;
	public MemberVo() {
	}

	public MemberVo(String userid, String password, String username, String gender, int age, String email, String phone,
			String address, String hobby, Date enrolldate) {
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
		this.enrolldate = enrolldate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Date getEnrolldate() {
		return enrolldate;
	}

	public void setEnrolldate(Date enrolldate) {
		this.enrolldate = enrolldate;
	}
	
	
	public List<Family> getFamily() {
		return family;
	}

	public void setFamily(List<Family> family) {
		this.family = family;
	}

	@Override
	public String toString() {
		return "MemberVo [userid=" + userid + ", password=" + password + ", username=" + username + ", gender=" + gender
				+ ", age=" + age + ", email=" + email + ", phone=" + phone + ", address=" + address + ", hobby=" + hobby
				+ ", enrolldate=" + enrolldate + ", family=" + family + "]";
	}

	
	
	
}
