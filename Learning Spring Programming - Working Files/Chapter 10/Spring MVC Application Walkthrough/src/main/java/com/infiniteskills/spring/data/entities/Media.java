package com.infiniteskills.spring.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MEDIA")
public class Media {

	@Id
	@Column(name="MEDIA_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer mediaId;

	@Column(name="TITLE")
	private String title;

	@Column(name="FORMAT")
	private String format;

	@Column(name="LENGTH")
	private Integer length;

	@Column(name="RATING")
	private Integer rating;

	@Column(name="IS_AVAILABLE")
	private Boolean isAvailable;
	
	@OneToOne
	@JoinColumn(name="RENTAL_LOCATION_ID")
	private RentalLocation rentalLocation;

	public Integer getMediaId() {
		return mediaId;
	}

	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public RentalLocation getRentalLocation() {
		return rentalLocation;
	}

	public void setRentalLocation(RentalLocation rentalLocation) {
		this.rentalLocation = rentalLocation;
	}

}
