package ifrn.pi.lojadesonhos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.lojadesonhos.models.Cliente;
import ifrn.pi.lojadesonhos.models.LojadeSonhos;
import ifrn.pi.lojadesonhos.repositories.ClienteRepository;

@Controller
@RequestMapping("/lojadesonhos")
public class ClienteController {
	
	@Autowired
	private ClienteRepository cr;
	
	@GetMapping("/formCliente")
	public ModelAndView loginCliente() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("cliente", new Cliente());
		mv.setViewName("lojadesonhos/formCliente");
		return mv;
	}
	
	@PostMapping("/salvarCliente")
	public String salvarCliente(Cliente cliente) {
		System.out.println(cliente);
		cr.save(cliente);
		return "lojadesonhos/cliente-cadastrado";
	}
	

}