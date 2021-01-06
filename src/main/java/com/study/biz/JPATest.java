package com.study.biz;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: JPATest
 *
 */
@Entity
@Table(name = "test1")
public class JPATest implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
