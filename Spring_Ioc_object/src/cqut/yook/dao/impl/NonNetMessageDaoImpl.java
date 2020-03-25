package cqut.yook.dao.impl;

import cqut.yook.dao.MessageDao;

public class NonNetMessageDaoImpl implements MessageDao {
	@Override
	public void send() {
		System.out.println("发送非网络消息");
	}
}
