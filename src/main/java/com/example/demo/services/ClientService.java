package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.ClientDTO;
import com.example.demo.mappers.ClientMapper;
import com.example.demo.models.Client;
import com.example.demo.repositories.ClientRepository;

import lombok.Data;

@Service
public  class ClientService {
	
	@Autowired
	private ClientRepository ClientRepo;
	
	
	public Client createClient(ClientDTO clientDTO) {
		Client client = ClientMapper.INSTANCE.dtoToModel(clientDTO);
		return ClientRepo.save(client);
	}
	
	public List<Client> getAllClients(){
		return ClientRepo.findAll();
	}

	public Client getClientById(long id) {
		System.out.println("*********************************************************");
		System.out.println(id);
		System.out.println("*********************************************************");
		Client client = ClientRepo.findById(id).orElse(null);
		System.out.println("*********************************************************");
		System.out.println(client);
		System.out.println("*********************************************************");
		return client;
	}
	
	public String deleteClient(long id) {
		ClientRepo.deleteById(id);
		return "client deleted !";
	}
	
	public Client updateClient(ClientDTO clientDTO) {
		Client existingClient = ClientRepo.findById(clientDTO.getId()).orElse(null);
		existingClient.setName(clientDTO.getName());
		return ClientRepo.save(existingClient);
	}

}
