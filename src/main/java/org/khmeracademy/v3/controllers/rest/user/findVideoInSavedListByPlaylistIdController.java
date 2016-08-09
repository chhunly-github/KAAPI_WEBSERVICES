package org.khmeracademy.v3.controllers.rest.user;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.services.impl.findVideoInSavedListByPlaylistIdImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/findVideoInSavedListByPlaylistId/findByID")
public class findVideoInSavedListByPlaylistIdController {

	@Autowired
	private findVideoInSavedListByPlaylistIdImpl findVideoByid;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findVideoInSavedListByPlaylistId(@PathVariable("id") int playlistid) {
		Map<String, Object> map = new HashMap<>();
		map.put("DATA", findVideoByid.findVideoinSavedListByPlaylistId(playlistid));
		map.put("STATUS",true);
		map.put("MESSAGE","success");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
}
