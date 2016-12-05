package org.seal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.seal.model.ResponseEntity;
import org.seal.model.User;

@Controller
public class UserController {
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity login() {

		ResponseEntity response;
		List<User> users = new ArrayList<User>();
		
		
		response = new ResponseEntity(users, 200, "Successful Login");
		return response;
		

	}

}
