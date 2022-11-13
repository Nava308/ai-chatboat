package com.statefarm.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.statefarm.chatbot.service.TransulationService;
import com.statefarm.chatbot.transulation.TransulationRequest;
import com.statefarm.chatbot.transulation.TransulationRestMapping;

@RestController
@RequestMapping(value = "/sf")
public class StateFarmController {
	@Autowired
	private TransulationService transulationService;

	/** User API's **/
	@GetMapping("/demo")
	public String demo() {
		return "NTS server is UP!!!";
	}

	@PostMapping(path = "/transulate", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public TransulationRestMapping addUser(@RequestBody TransulationRequest req) {
		System.out.println(req.toString());
		return transulationService.getTheTextTransulated(req);
	}
}
