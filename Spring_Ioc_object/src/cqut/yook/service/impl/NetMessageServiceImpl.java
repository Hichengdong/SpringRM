package cqut.yook.service.impl;

import cqut.yook.dao.MessageDao;
import cqut.yook.service.MessageService;

public class NetMessageServiceImpl implements MessageService {
	private MessageDao dao;

	@Override
	public void handle() {
		dao.send();
	}

	public void setDao(MessageDao dao) {
		this.dao = dao;
	}

}
