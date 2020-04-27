package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")	
	public List<Cliente> listar() {		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("71 99213-5181");
		cliente1.setEmail("vitors.dasil@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Teste");
		cliente2.setTelefone("71 91234-5678");
		cliente2.setEmail("teste@gmail.com");
		return Arrays.asList(cliente1,cliente2);
	}

}
