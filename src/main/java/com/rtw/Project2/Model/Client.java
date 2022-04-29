package com.rtw.Project2.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bucs")//Operable, gen. table
public class Client {
	
	
	//(strategy=GenerationType.IDENTITY)  //No variables in  list with "_"
	/*
	@GeneratedValue*/
	
	@Id
	private int client_id;
	@Column
	private int client_age;
	@Column
	private String client_name;
	@Column
	private String client_position;
	@Column
	private int client_cap_hit;//"cap_salary" in front end and mid tier
	@Column
	private int client_base_salary;
	@Column
	private int client_signing_bonus;
	@Column
	private int client_merchandise;
	@Column
	private int client_active;
	@Column
	private int client_salary_increase;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	//All but id
	public Client(String client_name, String client_position, int client_cap_hit, int client_base_salary, int client_signing_bonus,
			int client_merchandise, int client_active, int client_salary_increase) {
		super();
		this.client_age = client_age;
		this.client_name = client_name;
		this.client_position = client_position;
		this.client_cap_hit = client_cap_hit;
		this.client_base_salary = client_base_salary;
		this.client_signing_bonus = client_signing_bonus;
		this.client_merchandise = client_merchandise;
		this.client_active = client_active;
		this.client_salary_increase = client_salary_increase;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public int getClient_age() {
		return client_age;
	}
	public void setClient_age(int client_age) {
		this.client_age = client_age;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	
	public String getClient_position() {
		return client_position;
	}
	public void setClient_position(String client_position) {
		this.client_position = client_position;
	}
	
	public int getClient_cap_hit() {
		return client_cap_hit;
	}
	public void setClient_cap_hit(int client_cap_hit) {
		this.client_cap_hit = client_cap_hit;
	}
	public int getClient_base_salary() {
		return client_base_salary;
	}
	public void setClient_base_salary(int client_base_salary) {
		this.client_base_salary = client_base_salary;
	}
	public int getClient_signing_bonus() {
		return client_signing_bonus;
	}
	public void setClient_signing_bonus(int client_signing_bonus) {
		this.client_signing_bonus = client_signing_bonus;
	}
	public int getClient_merchandise() {
		return client_merchandise;
	}
	public void setClient_merchandise(int client_merchandise) {
		this.client_merchandise = client_merchandise;
	}
	public int getClient_active() {
		return client_active;
	}
	public void setClient_active(int client_active) {
		this.client_active = client_active;
	}
	public int getClient_salary_increase() {
		return client_salary_increase;
	}
	public void setClient_salary_increase(int client_salary_increase) {
		this.client_salary_increase = client_salary_increase;
	}
	
	@Override
	public String toString() {
		return "Client [client_id=" + client_id + ", client_name=" + client_name + ", client_cap_hit=" + client_cap_hit
				+ ", client_base_salary=" + client_base_salary + ", client_signing_bonus=" + client_signing_bonus
				+ ", client_merchandise=" + client_merchandise + ", client_active=" + client_active
				+ ", client_salary_increase=" + client_salary_increase + "]";
	}
	
	
	
}
