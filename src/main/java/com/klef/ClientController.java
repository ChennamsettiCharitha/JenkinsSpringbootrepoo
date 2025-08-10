package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ClientController {
	@GetMapping("/")
	public String home() {
		return "CI/CD  and Cloud Devops";
		}
	@GetMapping("/demo")
		public String demo() {
		return "Jenkins Demoo";
			
		}
	@GetMapping("/test")
	public String test() {
	return "deploy spring boot  the jenkins";
		
	}
	@GetMapping("/test1")
	public String test1() {
	return "spring boot project got the updated ";
	}	

	

}
