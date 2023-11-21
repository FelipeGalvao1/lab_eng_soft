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
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "idCliente", nullable = false)
	private int idCliente;

	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@Column(name = "email", length = 100, nullable = false)
	private String email;

	@Column(name = "senha", length = 100, nullable = false)
	private String senha;

	@Column(name = "tipoLogra", length = 30, nullable = false)
	private String tipoLogra;

	@Column(name = "logra", length = 100, nullable = false)
	private String logra;

	@Column(name = "bairro", length = 60, nullable = false)
	private String bairro;

	@Column(name = "comple", length = 60, nullable = true)
	private String comple;

	@Column(name = "numero", length = 6, nullable = false)
	private int numero;

	@Column(name = "cep", nullable = false)
	private long cep;

	@Column(name = "telefone", nullable = false)
	private Long telefone;
}
