package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClientDTO;
import com.example.demo.models.Client;
import com.example.demo.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService ClientService;
	
	@PostMapping
	public Client createClient(@RequestBody ClientDTO clientDTO) {
		return ClientService.createClient(clientDTO);
	}
	
	@DeleteMapping("/delete/{id}")
	public String  deleteClient(@PathVariable int id) {
		return ClientService.deleteClient(id);	
	}
	
	@GetMapping("/all")
	public List<Client> getClients() {
		return ClientService.getAllClients();
	}
	
	@GetMapping("/{id}")
	public Client getClient(@PathVariable long id) {
		return ClientService.getClientById(id);
	}
	
//	@PutMapping("/update")
//	public Client updateClient(@RequestBody Client client) {
//		return ClientService.updateClient(client);
//	}
	
	
}
