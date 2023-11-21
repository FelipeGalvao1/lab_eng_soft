package br.edu.fateczl.PizzariaRomero.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.fateczl.PizzariaRomero.repository.IClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	IClienteRepository cRep;

	public void opCliente() {
//			Cliente c1 = new Cliente(1,"Des Sw");

	}
}
