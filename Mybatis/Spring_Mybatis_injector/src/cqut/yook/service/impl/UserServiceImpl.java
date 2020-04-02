package cqut.yook.service.impl;

import java.util.List;

import cqut.yook.dao.UserMapper;
import cqut.yook.entity.User;
import cqut.yook.service.UserService;

public class UserServiceImpl implements UserService {
	private UserMapper userMapper;

	@Override
	public List<User> selectUser() {
		return userMapper.selectUser();
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
