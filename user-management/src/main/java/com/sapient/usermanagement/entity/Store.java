package com.sapient.usermanagement.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;




@Entity
@Table(name = "store")
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer storeId;
	@NotBlank(message = "Store name cannot be blank")
	private String storeName;	
	private String storeAddress;
	private String storeCity;
	private String storeState;
	private String storeCountry;
	private Long contactNumber;
	private String storeEmail;
	private Integer regionId;
	
	public Store() {
		
	}
	
	public Store(Integer storeId, @NotBlank(message = "Store name cannot be blank") String storeName,
			String storeAddress, String storeCity, String storeState, String storeCountry, Long contactNumber,
			String storeEmail, Integer regionId) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.storeCity = storeCity;
		this.storeState = storeState;
		this.storeCountry = storeCountry;
		this.contactNumber = contactNumber;
		this.storeEmail = storeEmail;
		this.regionId = regionId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreCity() {
		return storeCity;
	}

	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public String getStoreState() {
		return storeState;
	}

	public void setStoreState(String storeState) {
		this.storeState = storeState;
	}

	public String getStoreCountry() {
		return storeCountry;
	}

	public void setStoreCountry(String storeCountry) {
		this.storeCountry = storeCountry;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getStoreEmail() {
		return storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	



	    
}