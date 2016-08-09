package org.khmeracademy.v3.controllers.rest.user;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.services.impl.deleteSavedListBySaveListIdImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/savedlist/deletebySavedlistId")
public class deleteSavedListBySaveListIdController {

	@Autowired
	private deleteSavedListBySaveListIdImpl  deleteBySavedListID;
	
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteByID(@PathVariable("id") int id){
		Map<String, Object> map = new HashMap<>();
		deleteBySavedListID.deleteSavedList(id);
		map.put("STATUS",true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	}
	
	
	
}
