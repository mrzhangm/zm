package com.zd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zd.dao.IStudentDao;
import com.zd.entity.studentinfo;
import com.zd.service.IStudentService;
@Service
public class StudentService implements IStudentService{
	@Autowired
	private IStudentDao dao;
	
	public List<studentinfo> selall() {
		return dao.selall();
	}

	public void add(studentinfo studentinfo) {
		dao.add(studentinfo);
	}

	public void del(int sid) {
		dao.del(sid);
	}

	@Override
	public studentinfo selone(int sid) {
		return dao.selone(sid);
	}

	@Override
	public void update(studentinfo studentinfo) {
		dao.update(studentinfo);
	}

}
