package cqut.yook.bean;

public class Person {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void Call() {
		System.out.println("Please call to " + this.name);
	}
}
