package cqut.yook.factory;

import cqut.yook.model.User;

public class UserDynamicFactory {
	private UserDynamicFactory() {

	}

	public final User newInstance(String name) {
		return new User(name);
	}
}
