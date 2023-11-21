package br.edu.fateczl.PizzariaRomero.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@Column(name = "idProduto", nullable = false)
	private int idProduto;

	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@Column(name = "ingredientes", length = 100, nullable = false)
	private String ingredientes;

	@Column(name = "valor", nullable = false)
	private double valor;

}
