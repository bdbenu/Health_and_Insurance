package com.helth.and.insurance.user.service;

import java.util.List;

import com.helth.and.insurance.user.beans.UserBeans;

public interface IUserSeervice {
	public boolean saveUser(UserBeans beans);

	public List<UserBeans> getAllUser();

	public UserBeans getOneUserBeans(Integer id);

	public boolean deletUser(Integer id);
}
