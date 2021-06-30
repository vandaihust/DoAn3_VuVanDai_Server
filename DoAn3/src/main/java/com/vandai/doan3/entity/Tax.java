package com.vandai.doan3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tax")
@Entity
public class Tax {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "salary")
	private long salary;
	@Column(name = "tax")
	private long tax;
	@Column(name = "money")
	private long money;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getTax() {
		return tax;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	
}
