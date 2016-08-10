package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.entities.user.Log;
import org.khmeracademy.v3.services.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/eleaning/log")
public class UserLogController {

	@Autowired
	private UserLogService userLogService;
	
	@RequestMapping(value="/userlogId{userid}", method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllUserLog(@PathVariable("userid") int userid){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", userLogService.findAllUserLog(userid));
		map.put("MESSAGE", "SUCCESSFULLY GET DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	}

}
