package org.khmeracademy.v3.controllers.rest.user;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.entities.user.University;
import org.khmeracademy.v3.services.impl.UniversityImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/UniversityController")
public class UniversityController {
	@Autowired
	private UniversityImp universityImp;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAllUniversity() {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", universityImp.listUniversity());
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
	@RequestMapping(value="/getByUniversityID", method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllUniversityID(int id) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", universityImp.listUniversity());
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
	@RequestMapping(value="/addNewUniverisity", method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> AddNew(University university) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", universityImp.listUniversity());
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
	@RequestMapping(value="/deleteUniversity", method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>>  Delete(int id) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", universityImp.listUniversity());
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
	@RequestMapping(value="/updateUniversity", method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> Update(int id) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", universityImp.listUniversity());
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
}
