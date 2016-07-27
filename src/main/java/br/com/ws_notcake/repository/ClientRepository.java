package br.com.ws_notcake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ws_notcake.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
}
