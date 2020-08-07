package com.example.demo.Model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="supportanalyst")
public class SupportAnalyst {
	@Id
	@Generated("assigned")
	@Column
	private String analystId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String contactNumber; 
	@Column
	private String password;
	@Column
	private String Conformpassword;

	@Column
	private String status;

	public String getAnalystId() {
		return analystId;
	}

	public void setAnalystId(String analystId) {
		this.analystId = analystId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConformpassword() {
		return Conformpassword;
	}

	public void setConformpassword(String conformpassword) {
		Conformpassword = conformpassword;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SupportAnalyst [analystId=" + analystId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNumber=" + contactNumber + ", password=" + password + ", Conformpassword=" + Conformpassword
				+ ", status=" + status + "]";
	}
	
	
}

