package com.infiniteskills.spring.data.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="RENTAL_LOCATION")
public class RentalLocation {

	@Id
	@Column(name="RENTAL_LOCATION_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rentalLocationId;

	@Column(name="NAME")
	private String name;

	@Column(name="ADDRESS1")
	private String address1;

	@Column(name="ADDRESS2")
	private String address2;

	@Column(name="CITY")
	private String city;

	@Column(name="STATE")
	private String state;

	@Column(name="POSTAL_CODE")
	private String postalCode;
	
	@Transient
	private List<Media> media = new ArrayList<Media>();

	public Integer getRentalLocationId() {
		return rentalLocationId;
	}

	public void setRentalLocationId(Integer rentalLocationId) {
		this.rentalLocationId = rentalLocationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public List<Media> getMedia() {
		return media;
	}

	public void setMedia(List<Media> media) {
		this.media = media;
	}

}
