package com.zd.entity;

public class userinfo {

	private int uid;
	private String uname;
	private String upwd;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public userinfo() {
		
	}
	public userinfo(int uid, String uname, String upwd) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
	}
	
	
}
