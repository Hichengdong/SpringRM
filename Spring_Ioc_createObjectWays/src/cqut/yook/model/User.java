package cqut.yook.model;

public class User {
	private String name;

	public User() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("name : " + this.name);
	}
}
