package com.infiniteskills.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infiniteskills.spring.data.entities.Media;
import com.infiniteskills.spring.data.services.RentalService;

@Controller
public class HomeController {

	@Autowired
	private RentalService rentalService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String search() {
		return "search";
	}
	
	@RequestMapping(value="search")
	public String results(@RequestParam("title") String title, Model model) {
		model.addAttribute("title", title);
		model.addAttribute("titles", this.rentalService.findTitle("%" + title + "%"));
		return "result";
	}
	
	@RequestMapping(value="rent/{mediaId}")
	public String rent(@PathVariable("mediaId") Integer mediaId, Model model){
		Media media = rentalService.findById(mediaId);
		model.addAttribute("title", media.getTitle());
		model.addAttribute("location", media.getRentalLocation().getName());
		rentalService.rent(media);
		return "complete";
	}
	
	@RequestMapping("addMedia")
	public String addMedia() {
		return "addMedia";
	}
	
	@RequestMapping(value="add")
	public String add(Media media) {
		this.rentalService.addMedia(media);
		return "search";
	}
	
}
