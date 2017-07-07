package com.epam.shevchenko.controller.command;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.epam.shevchenko.bean.User;
import com.epam.shevchenko.controller.util.ResponseWriter;

public abstract class BaseCommand implements Command {
	protected Logger log = Logger.getLogger(getClass());

	
	protected String createPositiveResponse(User user) {
		// wraps user into list to use common method
		List<User> wrapedUser = new ArrayList<User>();
		wrapedUser.add(user);

		String response = ResponseWriter.writeUsersToResponse(wrapedUser);
		return response;
	}

	protected String createPositiveResponse(String message) {
		String  response = message;
		return response;
	}
	
	protected String createNegativeResponse(String message) {
		String  response = message;
		return response;
		
	}

}
