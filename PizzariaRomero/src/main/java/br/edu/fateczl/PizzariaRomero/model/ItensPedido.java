package br.edu.fateczl.PizzariaRomero.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Table(name = "itensPedido")

public class ItensPedido {

	@Id
	@Column(name = "idItensPedido", nullable = false)
	private int idItensPedido;

	@ManyToOne(targetEntity = Pedido.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "idPedido", nullable = false)
	private Pedido pedido;

	@OneToOne(targetEntity = Produto.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "idProduto", nullable = false)
	private Produto produto;

	@Column(name = "qtd", nullable = false)
	private int qtd;

	@Column(name = "valor", precision = 4, scale = 2, nullable = false)
	private String valor;

}
