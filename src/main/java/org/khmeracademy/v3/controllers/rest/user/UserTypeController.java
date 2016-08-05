package org.khmeracademy.v3.controllers.rest.user;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.entities.user.UserType;
import org.khmeracademy.v3.services.impl.UserTypeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user/type")
public class UserTypeController {
	
	@Autowired
	private UserTypeImpl usertypeimpl;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> allusertype(){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", usertypeimpl.findAllUserType());
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteUserType(@PathVariable("id") int id){
		Map<String, Object> map =  new HashMap<>();
		map.put("STATUS", true);
		map.put("SUCCESS", "delete success...!!");
		usertypeimpl.delete(id);
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> saveUserType(@RequestBody UserType usertype){
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", usertypeimpl.Save(usertype));
		map.put("SUCCESS", "success");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateUserType(@RequestBody UserType usertype){
		Map<String, Object> map = new HashMap<>();
		map.put("DATA",usertypeimpl.updateUserType(usertype));
		map.put("STATUS", true);
		map.put("MESSAGE","SUCCESS");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
		
	}

	@RequestMapping(value="/usertype_id",method= RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findUserTypwById(@PathVariable("id") int id){
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", usertypeimpl.findByid(id));
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(value="/user_id",method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> finfByUserId(@PathVariable("id") int id){
		Map<String, Object> map = new  HashMap<>();
		map.put("DATA", usertypeimpl.findByUserId(id));
		map.put("STATUS", true);
		map.put("MESSAGE","success");
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}

}




