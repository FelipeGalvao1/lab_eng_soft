package br.edu.fateczl.PizzariaRomero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.PizzariaRomero.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer> {

}
