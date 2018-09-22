package com.zd.service;

import java.util.List;

import com.zd.entity.studentinfo;

public interface IStudentService {

	//²éÑ¯ËùÓĞ
	public List<studentinfo> selall();
	
	public void add(studentinfo studentinfo);
	
	public void del(int sid);
	
	public studentinfo selone(int sid);
	
	public void update(studentinfo studentinfo);
}
