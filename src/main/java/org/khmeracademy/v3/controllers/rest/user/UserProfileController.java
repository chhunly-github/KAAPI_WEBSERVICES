package org.khmeracademy.v3.controllers.rest.user;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.services.user.UserProfileVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user/userprofile")
public class UserProfileController {
	@Autowired
	private UserProfileVideoService userProfileVideoService;
	
	
	@RequestMapping(value = "/findWatchedVideoByUserId/{userid}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findWatchedVideoByUserId(@PathVariable("userid") int userid) {

		Map<String, Object> map=new HashMap<>();
		map.put("DATA", userProfileVideoService.findWatchedVideoByUserId(userid));
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map,HttpStatus.OK);

	}
}
