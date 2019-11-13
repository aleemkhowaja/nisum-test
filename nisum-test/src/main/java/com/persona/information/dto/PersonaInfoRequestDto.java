package com.persona.information.dto;

/**
 * This is the Request DTO for sending parameters
 * @author Alim Khowaja
 *
 */
public class PersonaInfoRequestDto {
	
	private Integer id;
	private String name;
	private String lastName;
	private String address;
	private Integer phoneNumber;
	private String hairColorEnum;
	private String status;
	
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
	public String getHairColorEnum() {
		return hairColorEnum;
	}
	public void setHairColorEnum(String hairColorEnum) {
		this.hairColorEnum = hairColorEnum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}