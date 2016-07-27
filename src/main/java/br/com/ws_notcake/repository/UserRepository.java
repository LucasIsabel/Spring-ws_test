package br.com.ws_notcake.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ws_notcake.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
