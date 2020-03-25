package cqut.yook.model;

import java.util.Properties;

public class Dep {
	private Properties info;

	public void print() {
		System.out.println(info);
	}

	public Properties getInfo() {
		return info;
	}

	public void setInfo(Properties info) {
		this.info = info;
	}
}
