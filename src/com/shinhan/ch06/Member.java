package com.shinhan.ch06;

public class Member {
	private String name;
	private String id;
	private String pw;
	private int age;
	
	public Member() {
		
	}

	public Member(String name) {
		this(name,null,null,0);
	}
	
	public Member(String name, String id) {
		this(name,id,null,0);
	}
	
	public Member(String name, String id, String pw) {
		this(name,id,pw,0);
	}
	
	public Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	public void setName(String name) {
		
	}
}
