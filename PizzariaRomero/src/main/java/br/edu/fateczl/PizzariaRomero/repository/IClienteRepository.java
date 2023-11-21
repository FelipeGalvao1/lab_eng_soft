package br.edu.fateczl.PizzariaRomero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.PizzariaRomero.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
