package com.apex.restws;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.apex.model.Hotel;



@RestController
public class Home {
	
	public static HashMap<Integer, Hotel> hotels = new HashMap<>();
	
	@PostConstruct
	public void init(){
		Hotel h1 = new Hotel();
		h1.setName(Arrays.asList("A", "B", "C"));

		Hotel h2 = new Hotel();
		h2.setName(Arrays.asList("D", "E", "F"));
		
		Hotel h3 = new Hotel();
		h3.setName(Arrays.asList("G", "H", "I"));
		
		
		hotels.put(95131, h1);
		hotels.put(95132, h2);
		hotels.put(95133, h3);
	}
	
	@GetMapping("/hotel/{zip}")
	public Hotel home(@PathVariable int zip) {
		return hotels.get(zip);
		
	}

}


