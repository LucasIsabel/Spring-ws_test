package br.com.ws_notcake.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ws_notcake.model.User;
import br.com.ws_notcake.service.UserServiceBean;

@RestController
@RequestMapping(value = "/User")
public class UserController {

	@Autowired
	UserServiceBean userServiceBean;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User create(User user){
		user = new User("User", "email@email.com", "123456789");
		return userServiceBean.save(user);
	}
	
	@RequestMapping(value = "/get/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> userGetAll(){
		return userServiceBean.listarUsers();
	}
	
}
