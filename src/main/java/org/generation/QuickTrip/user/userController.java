package org.generation.QuickTrip.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user/")
public class userController {

    private final userService uService;

	@Autowired
	public userController(userService uService) {
		this.uService = uService;
	}//constructor
	@GetMapping
	public List<user> getUsers(){
		return uService.getUsers();
	}

	@GetMapping(path = "{userId}")
    public user getUser(@PathVariable("userId") Long userId){
		return uService.getUser(userId);
		
	}//getusers

	@DeleteMapping(path="{userId}")
	public void deleteTour(@PathVariable("userId") Long userId) {
		uService.deleteuser(userId);
	}//deleteTour
	
	@PostMapping
	public void addUser() {
		
	}//addTour
	
	@PutMapping
	public void updateUser() {
		
	}
}
