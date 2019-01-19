package com.clsb.bean;

public class Person {

	// javabean

	private String name;

	private int age;

	private String sex;

	private int id;

	/* 有参的 构造方法 */

	public Person() {
		super();
	}

	public Person(String name, int age, String sex, int id) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", id=" + id + "]";
	}

}
