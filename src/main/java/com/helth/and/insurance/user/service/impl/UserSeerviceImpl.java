package com.helth.and.insurance.user.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helth.and.insurance.user.beans.UserBeans;
import com.helth.and.insurance.user.entity.User;
import com.helth.and.insurance.user.repo.IUserRepositary;
import com.helth.and.insurance.user.service.IUserSeervice;

@Service
public class UserSeerviceImpl implements IUserSeervice {
	@Autowired
	private IUserRepositary userrepo;

	@Override
	public boolean saveUser(UserBeans beans) {
		User entity = new User();
		BeanUtils.copyProperties(beans, entity);
		User save = userrepo.save(entity);
		return save.getUserId() != null;
	}

	@Override
	public List<UserBeans> getAllUser() {
		List<User> entities = userrepo.findAll();
		List<UserBeans> users = new ArrayList<UserBeans>();
		for (User entity : entities) {
			UserBeans user = new UserBeans();
			BeanUtils.copyProperties(user, entity);
			users.add(user);
		}
		return users;
	}

	@Override
	public UserBeans getOneUserBeans(Integer id) {
		Optional<User> findById = userrepo.findById(id);
		if (findById.isPresent()) {
			User entity = findById.get();
			UserBeans user = new UserBeans();
			BeanUtils.copyProperties(user, entity);
		}

		return null;
	}

	@Override
	public boolean deletUser(Integer id) {

		return false;
	}

}
