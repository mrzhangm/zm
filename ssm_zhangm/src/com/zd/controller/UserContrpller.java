package com.zd.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zd.entity.userinfo;
import com.zd.service.IUserService;
@Controller
public class UserContrpller {
	@Autowired
	private IUserService UserService;
	
	
	//ȥ��¼
	@RequestMapping("/tologin")
	public String tologin() {
		return "login";
	}
	
	//��¼
	@RequestMapping("/login")
	public String login(@RequestParam Map<String, String> map,HttpSession session) {
		Logger log = LoggerFactory.getLogger(UserContrpller.class);
		try {
		userinfo loginmap = UserService.login(map);
		if(loginmap!=null){
			//��¼�ɹ�
			session.setAttribute("user", loginmap);
			return "redirect:selall";
		}else{
			//��¼ʧ�� 
			return "redirect:tologin";
		}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("��¼ʧ��",e);
		}
		return "redirect:tologin";
	}
}
