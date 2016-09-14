package com.bigbird.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bigbird.api.dubbo.UserService;
import com.bigbird.entity.User;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Reference
	private UserService userService;

	@RequestMapping(value="/")
	public String goIndex() {
		return "index";
	}

	@RequestMapping(value="/list")
	@ResponseBody
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@RequestMapping(value="/one")
	@ResponseBody
	public User getUserById() {
		return userService.getUserByPrimaryKey("1");
	}
}
