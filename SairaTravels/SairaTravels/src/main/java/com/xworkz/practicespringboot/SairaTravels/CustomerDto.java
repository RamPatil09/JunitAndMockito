package com.xworkz.practicespringboot.SairaTravels;

public class CustomerDto {

	private long id;
	private String name;
	private long age;
	private String sex;

	public CustomerDto(long id, String name, long age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {   
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}
