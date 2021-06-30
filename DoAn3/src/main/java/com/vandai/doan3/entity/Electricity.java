package com.vandai.doan3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "electricity")
@Entity
public class Electricity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "unit_price")
	private int unitPrice;
	@Column(name = "count")
	private int count;
	@Column(name = "count_compare")
	private int counCompare;
	@Column(name = "money")
	private int money;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCounCompare() {
		return counCompare;
	}
	public void setCounCompare(int counCompare) {
		this.counCompare = counCompare;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
