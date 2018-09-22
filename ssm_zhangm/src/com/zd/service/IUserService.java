package com.zd.service;

import java.util.Map;

import com.zd.entity.userinfo;

public interface IUserService {

	public userinfo login(Map<String, String> map);
}
