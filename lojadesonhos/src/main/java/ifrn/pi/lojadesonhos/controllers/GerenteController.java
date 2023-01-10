package ifrn.pi.lojadesonhos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.lojadesonhos.models.Funcionario;
import ifrn.pi.lojadesonhos.models.Gerente;
import ifrn.pi.lojadesonhos.repositories.GerenteRepository;

@Controller
@RequestMapping("/lojadesonhos")
public class GerenteController {
	
	@Autowired
	private GerenteRepository gr;
	
	@GetMapping("/formGerente")
	public ModelAndView loginGerente() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("gerente", new Gerente());
		mv.setViewName("lojadesonhos/formGerente");
		return mv;
	}
	
	@PostMapping("/salvarGerente")
	public String salvarFuncionario(Gerente gerente) {
		System.out.println(gerente);
		gr.save(gerente);
		return "lojadesonhos/gerente-cadastrado";
	}


}
