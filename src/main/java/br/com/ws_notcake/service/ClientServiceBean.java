package br.com.ws_notcake.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ws_notcake.model.Client;
import br.com.ws_notcake.repository.ClientRepository;

@Service
@Transactional
public class ClientServiceBean {

	@Autowired
	private ClientRepository clientRepository;
	
	@PersistenceContext
	private EntityManager entityManager;

	public Client save (Client client){
		entityManager.persist(client);
		entityManager.flush();
		return client;
	}
	
	public Client findById(Long id){
		Client searchClient = clientRepository.findOne(id);
		if(searchClient == null){
			return null;
		}
		return searchClient;
	}
	
	public List<Client> findAll(){
		List<Client> greetings = clientRepository.findAll();
		return greetings;
	}
	
	public Client create(Client client){
		if(client.getId() != null){
			return null;
		}
		Client savedClient = clientRepository.save(client);
		return savedClient;
	}
	
	public Client update(Client client){
		Client getIdClient = clientRepository.getOne(client.getId());
		if(getIdClient == null){
			return null;
		}
		Client updateClient = clientRepository.save(client);
		return updateClient;
	}
	
	public boolean delete(Long id){
		Client client = clientRepository.findOne(id);
		if(client.getId() == null){
			return false;
		}
		clientRepository.delete(client);
		return true;
	}
	
}
