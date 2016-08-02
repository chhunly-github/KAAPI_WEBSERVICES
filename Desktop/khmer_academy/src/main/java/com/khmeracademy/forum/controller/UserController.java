package com.khmeracademy.forum.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import com.khmeracademy.forum.entities.User;
import com.khmeracademy.forum.services.userService.userServicesImpl.UserServicesImpl;

@Controller
public class UserController {
	@Autowired UserServicesImpl im;
	
	@RequestMapping(value="/getAllUser",method=RequestMethod.GET)
	@ResponseBody
	ArrayList<User> getAllUser(){
		return im.getAllUser();
	}
	
	@RequestMapping(value="/getUser/{id}",method=RequestMethod.GET)
	@ResponseBody
	User getUser(@PathVariable("id") int id){
		return im.getUser(id);
	}
	
	@RequestMapping(value="/createUser",method=RequestMethod.POST)
	@ResponseBody
	boolean createUser(@ModelAttribute User user){
		return im.createUser(user);
	}
	@RequestMapping(value="/updateUser",method=RequestMethod.PUT)
	@ResponseBody
	boolean updateUser(@ModelAttribute User user){
		return im.updateUser(user);
	}
	
	@RequestMapping(value="/cleanUser/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	boolean cleanUser(@PathVariable("id") int id){
		return im.removeUser(id);
	}
	
	
}
