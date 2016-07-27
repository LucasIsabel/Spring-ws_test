package br.com.ws_notcake.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ws_notcake.model.User;
import br.com.ws_notcake.repository.UserRepository;

@Service
@Transactional
public class UserServiceBean {

	@Autowired
	UserRepository userRepository;
	
	@PersistenceContext
	EntityManager entityManager;
	
	public User save(User user){
		entityManager.persist(user);
		entityManager.flush();
		return user;
	}
	
	
	public List<User> listarUsers(){
		List<User> listaUsuario = userRepository.findAll();
		return listaUsuario;
	}
	
}
