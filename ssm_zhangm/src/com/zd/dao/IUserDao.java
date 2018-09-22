package com.zd.dao;

import java.util.Map;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.zd.entity.userinfo;

public interface IUserDao {

	@Select("select * from users where u_name=#{uname} and u_pwd=#{upwd}")
	@ResultMap("userMapper")
	public userinfo login(Map<String, String> map);
	
}
