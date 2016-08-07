package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.entities.elearning.Category;
import org.khmeracademy.v3.services.impl.findAllSubCategoryImpl;
import org.khmeracademy.v3.services.impl.findMainCategoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("api/elearning/category")
public class CategoryController {

	@Autowired
	private findMainCategoryImpl findmaincategoryImpl;

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllMainCategory() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("DATA", findmaincategoryImpl.findAllMainCategory());
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}

	@Autowired
	private findAllSubCategoryImpl findallSubCategory;
	
	@RequestMapping(value = "sub/{mainid}")
	public ResponseEntity<Map<String, Object>> findSubCategoryByMainCategoryId(@PathVariable("mainid") int mainid) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("DATA", findallSubCategory.findAllSubCategory(mainid));
		map.put("STATUS", true);
		map.put("MESSAGE", "success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(value = "/{catid}")
	public ResponseEntity<Map<String, Object>> deleteCategoryById(@PathVariable("catid") int catid) {
		Map<String, Object> map = new HashMap<String, Object>();

		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> saveNewCategory(@RequestBody Category category) {
		Map<String, Object> map = new HashMap<String, Object>();

		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping()
	public ResponseEntity<Map<String, Object>> updateCategory(@RequestBody Category category) {
		Map<String, Object> map = new HashMap<String, Object>();

		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
}
