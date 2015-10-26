package com.infiniteskills.spring.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infiniteskills.spring.data.entities.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media,Integer>{

	public List<Media> findByTitleLikeAndIsAvailableIsTrue(String title);
	
	public List<Media> findByRating(Integer rating);
}
