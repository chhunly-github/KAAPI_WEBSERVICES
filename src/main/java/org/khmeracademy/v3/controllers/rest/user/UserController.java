package org.khmeracademy.v3.controllers.rest.user;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.User;
import org.khmeracademy.v3.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value="/findAllUser" ,method=RequestMethod.GET)
	public String findAllUser(ModelMap model){
	ArrayList<User> users = userService.findAllUser();
	model.addAttribute("users", users);
		return "index";
		
	}
}
