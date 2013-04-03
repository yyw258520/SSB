package com.ssb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssb.pojo.User;
import com.ssb.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService us;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String login(User user) {

		if (user.getUsername() != null) {
			List<User> ls = us.getUser(user.getUsername());
			if (ls.size() < 1) {
				return "error";
			} else {
				User u = ls.get(0);
				if (u.getPwd().equals(user.getPwd())) {
					return "success";
				} else {
					return "error";
				}
			}
		} else {
			return "error";
		}

	}
}
