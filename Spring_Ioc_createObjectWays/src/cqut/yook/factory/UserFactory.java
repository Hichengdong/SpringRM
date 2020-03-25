package cqut.yook.factory;

import cqut.yook.model.User;

public class UserFactory {
	private UserFactory() {

	}

	public final static User newInstance(String name) {
		return new User(name);
	}
}
