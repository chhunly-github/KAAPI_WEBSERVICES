package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.services.elearning.playlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/elearning/playlist/")
public class PlayListControllers {

	@Autowired
	private playlistService playlistservice;

	@RequestMapping(value = "/playlist_findByid/{id}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getById(@PathVariable("id") int id) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", playlistservice.getById(id));
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(value = "/playlist_getAll", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAll() {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", playlistservice.getAll());
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	@RequestMapping(value = "/playlist_delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteById(@PathVariable("id") int id) {
		Map<String, Object> map = new HashMap<>();
		playlistservice.deletePlaylistId(id);
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findAllVideoBy_playlistID/{id}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllVideoByPlayListID(@PathVariable("id") int id) {
		Map<String, Object> map = new HashMap<>();
		try{
			map.put("DATA", playlistservice.findAllVideoByPlaylistid(id));
			map.put("STATUS", true);
			map.put("MESSAGE", "SUCCESS");
		}catch (Exception e) {
			map.put("STATUS", false);
			e.printStackTrace();
		}
		
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findAllVideoByMainCategoryID/{catId}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAllVideoByMainCategoryID(@PathVariable("catId") int catId) {
		Map<String, Object> map = new HashMap<>();
		try{
			map.put("DATA", playlistservice.findAllVideoByMainCategoryID(catId));
			map.put("STATUS", true);
			map.put("MESSAGE", "SUCCESS");
		}catch (Exception e) {
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
}
