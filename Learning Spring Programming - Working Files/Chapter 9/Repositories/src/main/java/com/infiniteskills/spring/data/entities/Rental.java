package com.infiniteskills.spring.data.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RENTAL")
public class Rental {

	@Id
	@Column(name="RENTAL_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rentalId;

	@OneToOne
	@JoinColumn(name="MEDIA_ID")
	private Media media;

	@OneToOne
	@JoinColumn(name="PICKUP_LOCATION_ID")
	private RentalLocation pickupLocation;

	@OneToOne
	@JoinColumn(name="RETURN_LOCATION_ID")
	private RentalLocation returnLocation;

	@Column(name="PICKUP_DATE")
	private Date pickupDate;

	@Column(name="RETURN_DATE")
	private Date returnDate;

	public Integer getRentalId() {
		return rentalId;
	}

	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public RentalLocation getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(RentalLocation pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public RentalLocation getReturnLocation() {
		return returnLocation;
	}

	public void setReturnLocation(RentalLocation returnLocation) {
		this.returnLocation = returnLocation;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

}
