package com.lokesh.Banking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lokesh.Banking.model.Login;
import com.lokesh.Banking.repo.LoginRepository;

@CrossOrigin(origins = "http://18.117.93.129:5173")
@RestController
@RequestMapping("/Banking")
public class CustomerDetails {
	@Autowired
	LoginRepository loginRepository;
	
	@RequestMapping("/getAllCustomers")
	@ResponseBody
	public List<Login> getAllCustomers() {
		
		return loginRepository.findAll();
		
	}
	

}
