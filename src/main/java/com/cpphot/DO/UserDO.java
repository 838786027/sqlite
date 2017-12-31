package com.cpphot.DO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserDO {
	@Id
	@Column(name="name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserDO [name=" + name + "]";
	}
	
}
