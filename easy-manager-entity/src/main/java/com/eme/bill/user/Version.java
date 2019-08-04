package com.eme.bill.user;

import javax.persistence.Table;

import lombok.Getter;

@Table(name = "VERSION_APP")
@Getter
public class Version {
	
	private int id; 
	private String description;

	public Version() {
		id = 1;
		description = "nothing to say";
	}
}
