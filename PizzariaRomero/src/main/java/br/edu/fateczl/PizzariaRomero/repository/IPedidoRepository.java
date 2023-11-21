package br.edu.fateczl.PizzariaRomero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.PizzariaRomero.model.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {

}
