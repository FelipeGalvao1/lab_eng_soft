package br.edu.fateczl.PizzariaRomero.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "pedido")
public class Pedido {

	@Id
	@Column(name = "idPedido", nullable = false)
	private int idPedido;

	@ManyToOne(targetEntity = Cliente.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;

	@Column(name = "data", nullable = false)
	private LocalDateTime data;

	@Column(name = "valorTotal", precision = 4, scale = 2, nullable = false)
	private String valorTotal;

}
