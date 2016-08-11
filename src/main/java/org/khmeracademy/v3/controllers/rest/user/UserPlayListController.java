package org.khmeracademy.v3.controllers.rest.user;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.services.user.UserPlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/elearning/userplaylist/")
public class UserPlayListController {

	@Autowired
	private UserPlayListService userplaylist;

	@RequestMapping(value = "/playlist_findByUserId/{id}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findPlaylistByUserId(@PathVariable("id") int id) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", userplaylist.findPlaylistByUserId(id));
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
}
