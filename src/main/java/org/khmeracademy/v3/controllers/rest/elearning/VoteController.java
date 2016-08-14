package org.khmeracademy.v3.controllers.rest.elearning;
import java.util.HashMap;
import java.util.Map;
import org.khmeracademy.v3.entities.elearning.Vote;
import org.khmeracademy.v3.services.elearning.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/elearning/vote")
public class VoteController {
	
	@Autowired
	private VoteService voteSerice;
	
	
	@RequestMapping(value="/countbyvideoid/{vid}" ,method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> countVoteByVideoId(@PathVariable("vid") int vid){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", voteSerice.countVoteByVideoId(vid));
		if(map.get("DATA")==null){
			map.put("MESSAGE", "FAILED TO INSERT DATA");
			map.put("CODE", "405");
		}else{
			map.put("MESSAGE", "SUCCESSFULLY INSERTED DATA!");
			map.put("CODE", "200"); 
		}
		map.put("MESSAGE", "SUCCESSFULLY GET DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};	
	
	
	@RequestMapping(value="/countbyuserid/{vid}" ,method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> countVoteByUserId(@PathVariable("uid") int uid){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", voteSerice.countVoteByUserId(uid));
		if(map.get("DATA")==null){
			map.put("MESSAGE", "FAILED TO INSERT DATA");
			map.put("CODE", "405");
		}else{
			map.put("MESSAGE", "SUCCESSFULLY INSERTED DATA!");
			map.put("CODE", "200"); 
		}
		map.put("MESSAGE", "SUCCESSFULLY GET DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};	
	
	
	@RequestMapping(value="/save{vid}" ,method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> saveVoteVideo(@RequestBody Vote vote){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA",voteSerice.saveVoteVideo(vote));
		if(map.get("DATA")==null){
			map.put("MESSAGE", "FAILED TO INSERT DATA");
			map.put("CODE", "405");
		}else{
			map.put("MESSAGE", "SUCCESSFULLY INSERTED DATA!");
			map.put("CODE", "200"); 
		}
		
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};
	
	@RequestMapping(value={"/byVideoid{uid}"}, method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findVoteByVideoId(@PathVariable("vid") int vid){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", voteSerice.findVoteByVideoId(vid));
		if(map.get("DATA")==null){
			map.put("MESSAGE", "FAILED TO INSERT DATA");
			map.put("CODE", "405");
		}else{
			map.put("MESSAGE", "SUCCESSFULLY INSERTED DATA!");
			map.put("CODE", "200"); 
		}
		map.put("MESSAGE", "SUCCESSFULLY GET DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};	
	
	@RequestMapping(value={"/byuserid{uid}"}, method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findVoteByUserId(@PathVariable("uid") int uid){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", voteSerice.findVoteByUserId(uid));
		if(map.get("DATA")==null){
			map.put("MESSAGE", "FAILED TO INSERT DATA");
			map.put("CODE", "405");
		}else{
			map.put("MESSAGE", "SUCCESSFULLY INSERTED DATA!");
			map.put("CODE", "200"); 
		}
		map.put("MESSAGE", "SUCCESSFULLY GET DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};	
}

