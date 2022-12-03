package com.javacodestuffs.cassandra.springboot.cassandra.crud.model;

import java.sql.Timestamp;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Table
public class User {

	@PrimaryKey
	@Column(value = "id")
	private String id;

	@Column(value = "role")
	private String role;

	@Column(value = "user_name")
	private String username;

	@Column(value = "password")
	private String password;

	@Column(value = "firstname")
	private String firstname;

	@Column(value = "lastname")
	private String lastname;

	@Column(value = "email")
	private String email;

	@Column(value = "gender")
	private String gender;

	@Column(value = "city")
	private String city;

	@Column(value = "state")
	private String state;

	@Column(value = "zip")
	private String zip;

	@Column(value = "address")
	private String address;

	@Column(value = "modified_by")
	private String modifiedBy;

	@Column(value = "modified_date")
	private Timestamp modifiedDate;

	@Column(value = "created_date")
	private Timestamp createdDate;

	@Column(value = "dob")
	private Timestamp dob;

	@Column(value = "email_verified")
	private boolean emailVerified;

	@Column(value = "is_active")
	private boolean isActive;

	@Column(value = "mobile_number_verified")
	private boolean mobileNumberVerified;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getDob() {
		return dob;
	}

	public void setDob(Timestamp dob) {
		this.dob = dob;
	}

	public boolean isEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isMobileNumberVerified() {
		return mobileNumberVerified;
	}

	public void setMobileNumberVerified(boolean mobileNumberVerified) {
		this.mobileNumberVerified = mobileNumberVerified;
	}

}
