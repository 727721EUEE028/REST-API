package com.example.FinalProject.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.FinalProject.model.Login;
import com.example.FinalProject.service.Loginservice;

@RestController
@CrossOrigin
@RequestMapping("/")
public class LoginController {
    @Autowired
    public Loginservice lsep;
    
    @PostMapping("/login")
    public  Login postLoginInfo(@RequestBody Login l) {
   	  return lsep.saveDetails(l);
   	
    }
    @GetMapping("getlogin/{username}/{password}")
    public boolean login(@PathVariable String username,@PathVariable String password){
    	return lsep.getDetails(username, password);	
    }
}

