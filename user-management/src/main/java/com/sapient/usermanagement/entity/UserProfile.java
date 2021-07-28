package com.sapient.usermanagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table( name = "user")
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@NotBlank(message = "Unique Identification Number cannot be blank")
	private Long UIN;
	private String password;
	private String employeeName;
	private Date hireDate;
	private String email;
	private Integer mobile;
	private String address;
	private String city;
	private String state;
	private String country;
	private Integer roleId;
	private Integer storeId;
	
	public UserProfile() {
		
	}

	public UserProfile(Integer userId, @NotBlank(message = "Unique Identification Number cannot be blank") Long uIN,
			String password, String employeeName, Date hireDate, String email, Integer mobile, String address,
			String city, String state, String country, Integer roleId, Integer storeId) {
		super();
		this.userId = userId;
		UIN = uIN;
		this.password = password;
		this.employeeName = employeeName;
		this.hireDate = hireDate;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.roleId = roleId;
		this.storeId = storeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Long getUIN() {
		return UIN;
	}

	public void setUIN(Long uIN) {
		UIN = uIN;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	
}
