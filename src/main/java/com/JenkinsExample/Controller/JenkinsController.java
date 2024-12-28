package com.JenkinsExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JenkinsController {
	@GetMapping(value="/get")
	public String getvalue(){
		return "Hi";
	}
}
