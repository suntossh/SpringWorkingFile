package com.infiniteskills.spring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infiniteskills.spring.data.entities.Media;
import com.infiniteskills.spring.data.services.RentalService;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		RentalService service = context.getBean(RentalService.class);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a title: ");
		List<Media> titles = service.findTitle("%" + scanner.nextLine() + "%");
		
		if(titles.isEmpty()) {
			System.out.println("Title not found.  Please try again.");
		}else {
			System.out.println("Title found at the following locations: ");
			for(int i = 0; i < titles.size(); i++) {
					System.out.printf("%d. %s\n", i + 1, titles.get(i).getRentalLocation().getName());					
			}
			
			System.out.println("Please select a location:");
			Media selected = titles.get(scanner.nextInt() - 1);
			service.rent(selected);
			System.out.printf("Rental of %s confirmed.", 
					selected.getTitle());
		}

	}
}