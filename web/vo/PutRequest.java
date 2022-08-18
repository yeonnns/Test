package com.test.web.vo;

import java.util.List;

public class PutRequest {
	private String name;
	private int age;
	private List<Car> carList;
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
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	@Override
	public String toString() {
		return "PutRequest [name=" + name + ", age=" + age + ", carList=" + carList + "]";
	}
	
}
