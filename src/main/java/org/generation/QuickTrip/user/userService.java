package org.generation.QuickTrip.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
	private final userRepository  userRep;
	
	@Autowired
	public userService(userRepository userRep) {
		this.userRep = userRep;
		System.out.println(userRep);
		
	}//constructor
	
		public List<user> getUsers(){
			return userRep.findAll();

		}//get Users

		public user getUser(Long userId) {
			return userRep.findById(userId).orElseThrow(() -> new IllegalStateException("El Usuario con el id "+ userId +" no existe."));

		}//getuser
	
		public void deleteUser(Long userId) {
			if (userRep.existsById(userId)) {
				userRep.deleteById(userId);
			}//
			
		}// deleteuser
		
		public void addUser(user use) {
			Optional<user> userByName = userRep.findByUserName(use.getUserName());
			if(userByName.isPresent()) {
				throw new IllegalStateException("El Usuario con el nombre [ "+use.getUserName()+" ] ya existe.");
			}else {
				userRep.save(use);
			}
			
		}
}
