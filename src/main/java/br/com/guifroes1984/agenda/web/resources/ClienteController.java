package br.com.guifroes1984.agenda.web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guifroes1984.agenda.domain.services.ClienteService;
import br.com.guifroes1984.agenda.dto.ClienteResponse;

@RestController
@RequestMapping("clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteResponse>> getClientes() {
		return ResponseEntity.ok(clienteService.getAll());
	}

}
