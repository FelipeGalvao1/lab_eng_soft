package br.edu.fateczl.PizzariaRomero;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.fateczl.PizzariaRomero.control.ProdutoController;

@SpringBootTest
class PizzariaRomeroApplicationTests {

	@Autowired
	private ProdutoController pCont;
	
	@Test
	void contextLoads() {
		pCont.opProduto();
	}

}
