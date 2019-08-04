package com.eme.bill;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eme.bill.enums.TypeBill;

import lombok.Data;

@Table(name = "BILL")
@Data
public abstract class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String description;
	
	public abstract TypeBill getType();
	
}
