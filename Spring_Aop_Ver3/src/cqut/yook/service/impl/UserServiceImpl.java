package cqut.yook.service.impl;

import cqut.yook.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public int add() {
		System.out.println("执行添加方法");
		return 0;
	}

	@Override
	public int modify() {
		System.out.println("执行修改方法");
		return 0;
	}

	@Override
	public int delete() {
		System.out.println("执行删除方法");
		return 0;
	}

	@Override
	public void find() {
		System.out.println("执行查询方法");
	}

}
