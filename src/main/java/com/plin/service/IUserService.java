package com.plin.service;

import com.plin.domain.User;

public interface IUserService {
	void save(User user);

	User get(Long id);

}
