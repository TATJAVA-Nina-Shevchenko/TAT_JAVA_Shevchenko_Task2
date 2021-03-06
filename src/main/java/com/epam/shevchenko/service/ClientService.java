package com.epam.shevchenko.service;

import com.epam.shevchenko.bean.User;
import com.epam.shevchenko.service.exception.ServiceException;

public interface ClientService {

	User login(String login,String password) throws ServiceException;

	boolean register(String login,String password, String telephone) throws ServiceException;

	User getUser(long id) throws ServiceException;

	User updateUser(User user) throws ServiceException;

	User changeUserStatus(User user) throws ServiceException;

	
}
