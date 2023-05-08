package com.postman.RestAPI.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class StudController {

	@GetMapping("/getName")
	public String getName() {
		return "Hepsi";
	}
	
	@PostMapping("/requestBody")
	public List<Map<String, Object>> path(@RequestBody List<Map<String,Object>> List) {
		return List;
	}
}
