package com.bots.business.service;

import org.springframework.stereotype.Service;

import com.bots.api.service.MyBotService;
import com.bots.domain.User;

@Service
public class MyBotServiceImpl implements MyBotService {

	@Override
	public User getUser(Long id) {
		return new User(1l, "<somename>");
	}

}
