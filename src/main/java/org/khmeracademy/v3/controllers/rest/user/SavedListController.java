package org.khmeracademy.v3.controllers.rest.user;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.services.user.SavedListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/savedlist")
public class SavedListController {

	@Autowired
	private SavedListService savedlistImpl;

	@RequestMapping(value="/delete/{savedlistid}",method = RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteByID(@PathVariable("savedlistid") int id) {
		Map<String, Object> map = new HashMap<>();
		savedlistImpl.deleteSavedList(id);
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
	@RequestMapping(value="/{userid}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllByUserId(@PathVariable("userid") int userid) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", savedlistImpl.findAllByUserId(userid));
		if(map.get("DATA")!=null){
			map.put("STATUS", true);
			map.put("MESSAGE", "SUCCESS");
		}else{
			map.put("STATUS", false);
			map.put("MESSAGE", "FAILED");
		}
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

}
