package com.cn.SSM.service.Impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.SSM.IDao.UserMapper;
import com.cn.SSM.pojo.User;
import com.cn.SSM.service.UserService;

@Service("UserService")  
public class UserServiceImpl implements UserService        {
	@Resource
	private UserMapper UserMapper;
	public User getUserById(int userId) {
		return UserMapper.selectByPrimaryKey(userId);
	}
}
