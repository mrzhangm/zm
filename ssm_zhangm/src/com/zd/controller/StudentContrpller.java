package com.zd.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.entity.studentinfo;
import com.zd.service.IStudentService;
@Controller
public class StudentContrpller {

	@Autowired
	private IStudentService StudentService;
	
	//查询所有
	@RequestMapping("/selall")
	public String selall(Map<String, Object> map) {
		Logger log = LoggerFactory.getLogger(UserContrpller.class);
		try {
			List<studentinfo> stulist = StudentService.selall();
			map.put("stulist", stulist);
			return "stu";
		} catch (Exception e) {
			log.error("查询失败",e);
		}
		return "stu";
	}
	
	@RequestMapping("toadd")
	public String toadd(){
		return "add";
	}
	
	@RequestMapping("add")
	public String add(studentinfo studentinfo) {
		StudentService.add(studentinfo);
		return "redirect:selall";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int sid) {
		StudentService.del(sid);
		return "1";
		}
	
	@RequestMapping("selone")
	public String selone(int sid,Map<String, Object> map) {
		studentinfo stu = StudentService.selone(sid);
		map.put("stu", stu);
		return "update";
	}
	
	@RequestMapping("update")
	public String update(studentinfo studentinfo) {
		StudentService.update(studentinfo);
		return "redirect:selall";
	}
	
}
