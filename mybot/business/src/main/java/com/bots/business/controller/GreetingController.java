package com.bots.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bots.api.service.MyBotService;
import com.bots.domain.User;

@RestController
public class GreetingController {

	@Autowired
	private MyBotService myBotService;

	@RequestMapping("/user/{id}")
	public User greeting(@PathVariable(value = "id") Long id) {
		return myBotService.getUser(id);
	}
}
