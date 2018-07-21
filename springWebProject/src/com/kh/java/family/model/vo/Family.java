package com.kh.java.family.model.vo;

public class Family {
	private String name;
	private int age;
	private String relation;
	private String memberUserid;

	public Family() {
	}

	
	public Family(String name, int age, String relation, String memberUserid) {
		super();
		this.name = name;
		this.age = age;
		this.relation = relation;
		this.memberUserid = memberUserid;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getMemberUserid() {
		return memberUserid;
	}

	public void setMemberUserid(String memberUserid) {
		this.memberUserid = memberUserid;
	}


	@Override
	public String toString() {
		return "Family [name=" + name + ", age=" + age + ", relation=" + relation + ", memberUserid=" + memberUserid
				+ "]";
	}
	
	
}
