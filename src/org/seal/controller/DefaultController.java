package org.seal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.seal.model.Dog;

@Controller
public class DefaultController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model) {
		
		System.out.println("Hello");
	
		model.addAttribute("message", "Spring 4 MVC Hello World Example Built with Maven");
		return "hello";
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/dogs", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List jsonPage() {

	        List<Dog> result = new ArrayList<Dog>();
	        
	        Dog dog1 = new Dog();
	        dog1.setAge(3);
	        dog1.setName("Sparky");
	        dog1.setWeight(25);
	        
	        result.add(dog1);
	        
	        Dog dog2 = new Dog();
	        dog2.setAge(1);
	        dog2.setName("Dino");
	        dog2.setWeight(11);
	        
	        result.add(dog2);
	        
	        dog2 = new Dog();
	        dog2.setAge(4);
	        dog2.setName("Yerin");
	        dog2.setWeight(19);
	        
	        result.add(dog2);
	        
	        dog2 = new Dog();
	        dog2.setAge(99999);
	        dog2.setName("Jason");
	        dog2.setWeight(99999);
	        
	        result.add(dog2);
	        
	        dog2 = new Dog();
	        dog2.setAge(1);
	        dog2.setName("Palo");
	        dog2.setWeight(5);
	        
	        result.add(dog2);

	    return result;
	}

}
