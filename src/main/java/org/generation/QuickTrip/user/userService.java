package org.generation.QuickTrip.user;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class userService {
	public final ArrayList<user> list = new ArrayList<user>();
		public userService() {
		list.add(new user("user1", "user1@mai.com", "password1", "User", "One", "5555555555", false, "02/22/2022"));
		}
		public ArrayList<user> getUsers(){
			return list;
		}

		public user getUser(Long userId) {
			user tmpUser = null;
			for (user u : list) {
				if(u.getId()== userId){
					tmpUser = u;
				}//if
			}//for each
			return tmpUser;
		}//getuser
	
		public void deleteuser(Long userId) {
			for (user u : list) {
				if(u.getId()== userId){
					list.remove(u);
					break;
				}//if
			}//for each
		}// deleteuser
}
