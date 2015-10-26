package com.infiniteskills.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infiniteskills.spring.data.entities.Media;
import com.infiniteskills.spring.data.repositories.MediaRepository;

public class ScratchPad {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		MediaRepository repo = context.getBean(MediaRepository.class);
		

		List<Media> titles = repo.findByRating(5);
		
		for(Media m :titles) {
			System.out.println(m.getTitle());
		}
	}
	
	public static Media getMedia() {
		Media media = new Media();
		media.setTitle("The Sum of All Fears");
		media.setFormat("DVD");
		media.setRating(5);
		media.setLength(220);
		return media;
	}
}