package org.khmeracademy.v3.controllers.rest.user;

import java.util.HashMap;
import java.util.Map;
import org.khmeracademy.v3.entities.user.Department;
import org.khmeracademy.v3.services.impl.DepartmentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/DepartmentController")

public class DepartmentController {
	@Autowired
	private DepartmentImpl DepartmentImp;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAllDepartment() {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", DepartmentImp.listDepartment());
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
	@RequestMapping(value="/getByDepartmentID", method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllDepartmentID(int id) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", DepartmentImp.listDepartment());
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
	@RequestMapping(value="/addNewDepartment", method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> AddNew(Department department) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", DepartmentImp.listDepartment());
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
	@RequestMapping(value="/deleteDepartment/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>>  Delete(@PathVariable("id") int id) {
		Map<String, Object> map = new HashMap<>();
		System.out.println("==>>"+id);
		DepartmentImp.Delete(id);
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
	@RequestMapping(value="/updateDepartment", method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> Update(@RequestBody Department department) {
		Map<String, Object> map = new HashMap<>();
		DepartmentImp.Update(department);
		System.out.println(department.getDepartmentId() + ", " + department.getDepartmentName());
		map.put("MESSAGE", "success");
		map.put("STATUS", true);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}
}

