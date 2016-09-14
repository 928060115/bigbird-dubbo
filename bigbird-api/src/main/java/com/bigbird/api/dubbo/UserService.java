package com.bigbird.api.dubbo;

import java.util.List;

import com.bigbird.entity.User;

public interface UserService {

	List<User> getUsers();
	User getUserByPrimaryKey(String id);
}
