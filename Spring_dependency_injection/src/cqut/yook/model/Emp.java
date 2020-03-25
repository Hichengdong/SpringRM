package cqut.yook.model;

public class Emp {
	private Dep dep;
	private String name;
	
	public void printMessage() {
//		System.out.println(dep.getName() + " : " + this.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDep(Dep dep) {
		this.dep = dep;
	}

	public Dep getDep() {
		return dep;
	}
}
