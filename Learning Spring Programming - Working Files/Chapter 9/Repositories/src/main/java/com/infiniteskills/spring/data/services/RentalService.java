package com.infiniteskills.spring.data.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.spring.data.entities.Media;
import com.infiniteskills.spring.data.entities.Rental;
import com.infiniteskills.spring.data.repositories.MediaRepository;
import com.infiniteskills.spring.data.repositories.RentalRepository;

@Service
public class RentalService {
	
	@Autowired
	private MediaRepository mediaRepository;
	
	@Autowired
	private RentalRepository rentalRepository;
	
	@Transactional
	public List<Media> findTitle(String title) {
		return this.mediaRepository.findByTitleLikeAndIsAvailableIsTrue(title);
	}
	
	@Transactional
	public void rent(Media media) {
		Rental rental = new Rental();
		media.setIsAvailable(false);
		
		rental.setPickupDate(new Date());
		rental.setPickupLocation(media.getRentalLocation());
		rental.setMedia(media);
		
		media.getRentalLocation().getMedia().remove(media);
		media.setRentalLocation(null);
		
		mediaRepository.save(media);	
		rentalRepository.save(rental);
	}
}
