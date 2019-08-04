package com.eme.bill.user;

import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Table(name = "USER")
@Data
@Builder
public class User {

	private int user;
	private String name;
	
}
