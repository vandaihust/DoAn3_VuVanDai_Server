package com.vandai.doan3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tax_table")
@Entity
public class TaxTable {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "salary_month")
	private String salaryMonth;
	@Column(name = "tax")
	private String tax;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalaryMonth() {
		return salaryMonth;
	}
	public void setSalaryMonth(String salaryMonth) {
		this.salaryMonth = salaryMonth;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	
}
