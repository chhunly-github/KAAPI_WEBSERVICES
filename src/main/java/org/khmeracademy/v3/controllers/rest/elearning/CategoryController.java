package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.entities.elearning.Category;
import org.khmeracademy.v3.services.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/elearning/category")
public class CategoryController {

	
	
	@Autowired
	private CategoryServiceImpl categoryImpl;

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllMainCategory() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("DATA", categoryImpl.findAllMainCategory());
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}

	/*@Autowired
	private findAllSubCategoryImpl findallSubCategory;
	
	@RequestMapping(value = "sub/{mainid}")
	public ResponseEntity<Map<String, Object>> findSubCategoryByMainCategoryId(@PathVariable("mainid") int mainid) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("DATA", findallSubCategory.findAllSubCategory(mainid));
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
*/
	@RequestMapping(value = "/{catid}",method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> deleteCategoryById(@PathVariable("catid") int catid) {
		Map<String, Object> map = new HashMap<String, Object>();
		categoryImpl.deleteCategoryById(catid);
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> saveNewCategory(@RequestBody Category category) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("DATA", categoryImpl.saveNewCategory(category));
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> updateCategory(@RequestBody Category category) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("DATA",categoryImpl.updateCategory(category));
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
}
