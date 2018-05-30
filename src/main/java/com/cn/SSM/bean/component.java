package com.cn.SSM.bean;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cn.SSM.IDao.UserMapper;
import com.cn.SSM.pojo.User;

@Component
public class component {
	@Resource
	private UserMapper UserMapper;
	
	public static component Component;
	
	@PostConstruct 
	public void init() { 
		Component = this;
    } 
	
	public void run() {
		User user = Component.UserMapper.selectByPrimaryKey(1);
		System.out.println("第一个用户姓名为："+user.getUserName());
	}
}
