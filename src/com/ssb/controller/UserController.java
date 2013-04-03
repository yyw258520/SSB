package com.ssb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssb.pojo.User;
import com.ssb.service.UserService;



@Controller
public class UserController {

	@Autowired
	private UserService us;
	@RequestMapping("/user")
	public String test(Model md) {
		md.addAttribute("name", "xiao_yyw");
		return "user";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model md, @RequestParam(value = "id") int id) {
		System.out.println(id);
		User u = us.getUser(id);
		md.addAttribute("u", u);
		md.addAttribute("name", "xiao_yyw登录成功");
		return "user";
	}
}
