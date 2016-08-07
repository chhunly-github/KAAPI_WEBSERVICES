package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.services.elearning.playlistService;
import org.khmeracademy.v3.services.elearning.playlistdetailService;
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
	private playlistdetailService playlistdetailService;
	
		
	@RequestMapping( value="/playlistdetail/{id}",method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getByPlaylistId(@PathVariable("id") int id){
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", playlistdetailService.getByplaylistId(id));
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
				
	}

	
	@Autowired
	private playlistService playlistservice;

	@RequestMapping(value="/playlist_findByid/{id}",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getById(@PathVariable("id") int id){
		Map<String, Object> map = new HashMap<>();
		map.put("DATA",playlistservice.getById(id));
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new  ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	
	@RequestMapping(value="/playlist_getAll",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("DATA",playlistservice.getAll());
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new  ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/playlist_delete/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteById(@PathVariable("id") int id){
		Map<String, Object> map = new HashMap<>();
		playlistservice.deletePlaylistId(id);
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new  ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
}
