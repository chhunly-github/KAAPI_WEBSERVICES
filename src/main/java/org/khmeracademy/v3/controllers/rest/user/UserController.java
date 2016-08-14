package org.khmeracademy.v3.controllers.rest.user;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.entities.user.User;
import org.khmeracademy.v3.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllUser() {

		Map<String, Object> map = new HashMap<>();
		map.put("DATA", userService.findAllUser());
		map.put("STATUS", false);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getUserInfoByUserId(@PathVariable("id") int id) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", userService.findByUserId(id));
		if (map.get("DATA") != null) {
			map.put("MESSAGE", "SUCCESS");
		} else {
			map.put("MESSAGE", "FAILED");
		}
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}/{userstatus}", method = RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteUserByUserId(@PathVariable("id") int id,@PathVariable("userstatus") int userstatus) {
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "FAILED");
		boolean status = userService.deleteUserByUserId(id,userstatus);
		if (status) {
			map.put("MESSAGE", "SUCCESS");
		}
		map.put("STATUS", status);

		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> Save(@RequestBody User user) {
		System.out.println(user);
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "FAILED");
		boolean status = userService.Save(user);
		if (status) {
			map.put("MESSAGE", "SUCCESS");
		}
		map.put("DATA", user);
		map.put("STATUS", status);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> findByUsernameAndPassword(@RequestParam String username,
			@RequestParam String password) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", userService.findByUserNameAndPassword(username, password));
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}

	@RequestMapping(value = "/updatepassword", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> updatePassword(@RequestParam String username,
			@RequestParam String newpassword, @RequestParam String oldpassword) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", userService.updateUserPassword(username, newpassword, oldpassword));
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	/*
	 * @RequestMapping(method=RequestMethod.POST) public
	 * ResponseEntity<Map<String, Object>> updateProfilePic(@RequestParam String
	 * username,@RequestParam String newpassword, @RequestParam String
	 * oldpassword){ Map<String , Object> map = new HashMap<>(); map.put("DATA",
	 * userService.updateUserPassword(username, newpassword, oldpassword));
	 * return new ResponseEntity<Map<String,Object>> (map,HttpStatus.OK); }
	 */

	@RequestMapping(value = "/update/point", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> updatePoint(@RequestParam int point, @RequestParam String username) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", userService.updatePointByUsername(point, username));
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(value = "/update/", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> updateInfoByID(@RequestBody User user) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", userService.updateUserInfoById(user));
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

}
