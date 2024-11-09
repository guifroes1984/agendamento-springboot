package br.com.guifroes1984.agenda.domain.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guifroes1984.agenda.domain.repositories.ClienteRepository;
import br.com.guifroes1984.agenda.dto.ClienteResponse;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<ClienteResponse> getAll() {
		
		return clienteRepository.buscarTodos("MA")
				.stream()
				.map(c -> c.toDTO())
				.collect(Collectors.toList());
	}

}
