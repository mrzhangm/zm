package com.zd.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zd.dao.IUserDao;
import com.zd.entity.userinfo;
import com.zd.service.IUserService;

@Service
public class UserService implements IUserService{
	@Autowired
	private IUserDao dao;
	
	public userinfo login(Map<String, String> map) {
		return dao.login(map);
	}
}
