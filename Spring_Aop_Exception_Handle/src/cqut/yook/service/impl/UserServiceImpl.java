package cqut.yook.service.impl;

import cqut.yook.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public int add() throws Exception{
		System.out.println("ִ����ӷ���");
		if (true) {
			throw new Exception();
		}
		return 0;
	}

	@Override
	public int modify() {
		System.out.println("ִ���޸ķ���");
		return 0;
	}

	@Override
	public int delete() {
		System.out.println("ִ��ɾ������");
		return 0;
	}

	@Override
	public void find() {
		System.out.println("ִ�в�ѯ����");
	}

}
