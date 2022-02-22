package org.generation.QuickTrip.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class userController {
	@GetMapping
	public List<tour> getTours(){
		
	}
}
