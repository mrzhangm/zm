package com.zd.entity;

public class studentinfo {

	private int sid;
	private String sname;
	private String ssex;
	private int sage;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public studentinfo() {
		
	}
	public studentinfo(int sid, String sname, String ssex, int sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
	}
	
	
}
