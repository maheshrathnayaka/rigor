package com.rigor.dao;

import java.util.List;

import com.rigor.model.User;

public interface UserDAO {
	public void addUser(User user);

	public void updateUser(User user);

	public User getUser(int id);

	public void deleteUser(int id);

	public List<User> getUsers();
}
