package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.servicesImplement.Elearning.playlistServiceImpl;
import org.khmeracademy.v3.servicesImplement.Elearning.playlistdetailServiceImpl;
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
	private playlistdetailServiceImpl playlistdetailServiceImpl;
	
		
	@RequestMapping( value="/playlistdetail",method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getByPlaylistId(@PathVariable("id") int id){
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", playlistdetailServiceImpl.getByplaylistId(id));
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
				
	}

	
	
	@Autowired
	private playlistServiceImpl playlistserviceimpl;

	@RequestMapping(value="/playlist_findByid",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getById(@PathVariable("id") int id){
		Map<String, Object> map = new HashMap<>();
		map.put("DATA",playlistserviceimpl.getById(id));
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new  ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	
	@RequestMapping(value="/playlist_getAll",method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("DATA",playlistserviceimpl.getAll());
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new  ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/playlist_delete",method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteById(@PathVariable("id") int id){
		Map<String, Object> map = new HashMap<>();
		playlistserviceimpl.deletePlaylistId(id);
		map.put("STATUS", true);
		map.put("MESSAGE", "SUCCESS");
		return new  ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
}
