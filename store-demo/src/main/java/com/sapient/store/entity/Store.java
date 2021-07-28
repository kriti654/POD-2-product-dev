package com.sapient.store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "store_demo")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer storeId;
    
    @NotBlank(message = "Store Name should not be empty ")
	private String storeName;
    
    @NotBlank(message = "Store Address should not be empty ")
    private String storeAddress;
    
    @NotBlank(message = "Store City should not be empty ")
    private String storeCity;
    
    @NotBlank(message = "Store State should not be empty ")
    private String storeState;
    
    @NotBlank(message = "Store Country should not be empty ")
    private String storeCountry;
    
    @NotNull
    //@NotBlank(message = "Mobile Number should not be empty ")
    //@Pattern(regexp="(^$|[0-9]{10})")
    private Long mobileNumber; 
    
    @NotNull
    @NotBlank(message = "Email should not be empty")
    @Email(message = "Enter correct email")
	private String email; 
    
    @NotNull
    //@NotBlank(message = "Region Id should not be empty")
	private Integer regionId;  

}
