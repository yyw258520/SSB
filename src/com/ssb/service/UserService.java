package com.ssb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssb.mapper.UserMapper;
import com.ssb.pojo.User;
import com.ssb.pojo.UserCriteria;


@Service
@Transactional
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User getUser(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public List<User> getUser(String username) {
		UserCriteria uc = new UserCriteria();
		uc.createCriteria().andUsernameEqualTo(username);
		return userMapper.selectByExample(uc);

	}
}
