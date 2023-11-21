package br.edu.fateczl.PizzariaRomero.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.fateczl.PizzariaRomero.model.Produto;
import br.edu.fateczl.PizzariaRomero.repository.IProdutoRepository;

@Controller
public class ProdutoController {

	@Autowired
	private IProdutoRepository pRep;

	public void opProduto() {
		Produto p1 = new Produto(1, "Calabresa I", "Calabresa, Muçarrela", 9.00);
		Produto p2 = new Produto(1, "Calabresa II", "Calabresa, Catupiry", 22.00);
		Produto p3 = new Produto(1, "Frango I", "Frango, Muçarrela", 15.00);
		Produto p4 = new Produto(1, "Calabresa I", "Frango, Catupiry", 22.00);
		Produto p5 = new Produto(1, "Carne I", "Carne moida temperada", 22.00);

		pRep.save(p1);
		pRep.save(p2);
		pRep.save(p3);
		pRep.save(p4);
		pRep.save(p5);

		List<Produto> produtos = pRep.findAll();
		produtos.forEach(c -> System.out.println(c));

		Produto pro = pRep.findById(p4.getIdProduto()).get();
		System.out.println(pro);

		p4.setNome("DOCE Banana");
		pRep.save(p4);

		pRep.delete(p5);

	}

}
