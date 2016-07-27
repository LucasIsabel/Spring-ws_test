package br.com.ws_notcake.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ws_notcake.model.Client;
import br.com.ws_notcake.service.ClientServiceBean;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	ClientServiceBean clientServiceBean;
	
	@RequestMapping(value = "/persist")
	public String persistData(){
		Client cliente = new Client("User", "email@email.com", "last_name", 123456);
		clientServiceBean.create(cliente);
		return "Cadastrado";
	}
	
	@RequestMapping(value = "/persist/manager", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Client saveData(){
		Client client = new Client("User", "email@hotmail.com", "las_name", 123456);
		return clientServiceBean.save(client);
	}
	
	@RequestMapping(value = "/registered", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Client> getAllClient(){
		return clientServiceBean.findAll();
	}
	
	@RequestMapping(value = "/registered/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Client registraUsuario(@PathVariable Long id){
		return clientServiceBean.findById(id);
	}
}
