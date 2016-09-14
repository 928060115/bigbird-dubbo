package com.bigbird.dubbo.service.imp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.config.annotation.Service;
import com.bigbird.api.dubbo.UserService;
import com.bigbird.entity.User;

@Service
public class UserServiceImpl implements UserService {

	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public List<User> getUsers() {
		logger.info("开始查询所有用户信息");

		List<User> listUser = new ArrayList<User>();
		User user1 = new User("1", "ivan", "123456");
		User user2 = new User("2", "jack", "123456");

		listUser.add(user1);
		listUser.add(user2);
		try {
			logger.info("查询结果：" + JSON.json(listUser));
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("查询结束");
		return listUser;
	}

	@Override
	public User getUserByPrimaryKey(String id) {
		User user = new User("1", "ivan", "123456");
		logger.info("开始查询用户信息，查询条件ID为:" + id);
		logger.info("查询结果：" + user.toString());
		return user;
	}

}
