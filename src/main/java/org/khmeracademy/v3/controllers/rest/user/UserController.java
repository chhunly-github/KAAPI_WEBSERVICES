package org.khmeracademy.v3.controllers.rest.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.entities.user.User;
import org.khmeracademy.v3.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllUser() {
		ArrayList<User> users = userService.findAllUser();
		Map<String, Object> map=new HashMap<>();
		map.put("DATA", users);
		map.put("STATUS", false);
		return new ResponseEntity<Map<String, Object>>(map,HttpStatus.OK);

	}
	
	@RequestMapping(value="/{id}", method= RequestMethod.DELETE )
	public ResponseEntity<Map<String,Object>> deleteUser(@PathVariable("id") int id){
		userService.deleteByAdmin(id);
		Map<String, Object> map = new HashMap<>();
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
	return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/user" ,method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>>  Save(User user){
		Map<String , Object> map = new HashMap<>();
			userService.Save(user);
			map.put("DATA", user);
			map.put("SUCCESS", false);
		return new ResponseEntity<Map<String,Object>> (map,HttpStatus.OK);
		
	}
}
