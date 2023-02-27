package entities;

public class Person {
	
	private String name;
	private double age;
	private double height;
	
	public Person(String name, double age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAge() {
		return age;
	}
	
	public void setAge(double age) {
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
}
