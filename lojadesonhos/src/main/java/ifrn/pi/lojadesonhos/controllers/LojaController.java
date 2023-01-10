package ifrn.pi.lojadesonhos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.lojadesonhos.models.LojadeSonhos;
import ifrn.pi.lojadesonhos.repositories.LojaRepository;

@Controller
@RequestMapping("/lojadesonhos")
public class LojaController {

	@Autowired
	private LojaRepository lr;

	// direciona para a página de formulário
	@GetMapping("/form")
	public String form() {
		return "lojadesonhos/formLoja";

	}

	@PostMapping
	public String adicionarPedido(LojadeSonhos lojadesonhos) {
		System.out.println(lojadesonhos);
		lr.save(lojadesonhos);
		return "lojadesonhos/pedido-adicionado";
	}

	@GetMapping
	public ModelAndView listarPedidos() {
		List<LojadeSonhos> lojadesonhos = lr.findAll();
		ModelAndView mv = new ModelAndView("lojadesonhos/lista");
		mv.addObject("lojadesonhos", lojadesonhos);
		return mv;
	}

	@GetMapping("/{id}")
	public ModelAndView detalharPedido(@PathVariable Long id) {
		ModelAndView md = new ModelAndView();
		Optional<LojadeSonhos> opt = lr.findById(id);
		if (opt.isEmpty()) {
			md.setViewName("redirect:/lojadesonhos");
			return md;
		}

		md.setViewName("lojadesonhos/detalhes");
		LojadeSonhos lojadeSonhos = opt.get();

		md.addObject("lojadesonhos", lojadeSonhos);

		return md;

	}
	
	@GetMapping("/{id}/remover")
	public String deletarPedido(@PathVariable Long id) {
		
		Optional<LojadeSonhos> opt = lr.findById(id);
		
		if(opt.isEmpty()) {
			LojadeSonhos lojadesonhos = opt.get();
			lr.delete(lojadesonhos);
		}
		
		return "redirect:/lojadesonhos";
	}
}
