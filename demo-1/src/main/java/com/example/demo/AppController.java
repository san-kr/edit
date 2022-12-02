package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller

public class AppController {
	
	@Autowired
    private adminRepository userRepo;
     
    @GetMapping("/admin")
    public String viewHomePage() {
        return "admin";
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
    	model.addAttribute("user", new admin());
    	
    	return "signup_form";
    }

}
