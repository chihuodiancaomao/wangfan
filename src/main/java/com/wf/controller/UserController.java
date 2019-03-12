package com.wf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wf.entity.TbUser;
import com.wf.server.impl.UserServer;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServer userServer;
	
	
	@RequestMapping("/findAll")
	public List<TbUser> findAll() {
		return userServer.findAll();
	}
}
