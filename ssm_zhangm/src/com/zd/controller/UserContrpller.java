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
	
	
	//È¥µÇÂ¼
	@RequestMapping("/tologin")
	public String tologin() {
		return "login";
	}
	
	//µÇÂ¼
	@RequestMapping("/login")
	public String login(@RequestParam Map<String, String> map,HttpSession session) {
		Logger log = LoggerFactory.getLogger(UserContrpller.class);
		try {
		userinfo loginmap = UserService.login(map);
		if(loginmap!=null){
			//µÇÂ¼³É¹¦
			session.setAttribute("user", loginmap);
			return "redirect:selall";
		}else{
			//µÇÂ¼Ê§°Ü 
			return "redirect:tologin";
		}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("µÇÂ¼Ê§°Ü",e);
		}
		return "redirect:tologin";
	}
}
