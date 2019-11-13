package com.persona.information.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.persona.information.enums.HairColorEnum;
import com.persona.information.enums.StatusEnum;

/**
 * This is Model class deal with database
 * @author USER
 *
 */
@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String lastName;
	
	private String address;
	
	private Integer phoneNumber;
	
	private HairColorEnum hairColorEnum;
	
	private StatusEnum statusEnum;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public HairColorEnum getHairColorEnum() {
		return hairColorEnum;
	}

	public void setHairColorEnum(HairColorEnum hairColorEnum) {
		this.hairColorEnum = hairColorEnum;
	}

	public StatusEnum getStatusEnum() {
		return statusEnum;
	}

	public void setStatusEnum(StatusEnum statusEnum) {
		this.statusEnum = statusEnum;
	}
}