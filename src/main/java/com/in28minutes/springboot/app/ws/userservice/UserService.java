package com.in28minutes.springboot.app.ws.userservice;

import com.in28minutes.springboot.app.ws.ui.model.request.UserDetailsRequestModel;
import com.in28minutes.springboot.app.ws.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}
