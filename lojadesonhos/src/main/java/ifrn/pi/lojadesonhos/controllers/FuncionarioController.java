package ifrn.pi.lojadesonhos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.lojadesonhos.models.Cliente;
import ifrn.pi.lojadesonhos.models.Funcionario;
import ifrn.pi.lojadesonhos.repositories.ClienteRepository;
import ifrn.pi.lojadesonhos.repositories.FuncionarioRepository;

@Controller
@RequestMapping("/lojadesonhos")
public class FuncionarioController {
	

		
		@Autowired
		private FuncionarioRepository fr;
		
		@GetMapping("/formFuncionario")
		public ModelAndView loginFuncionario() {
			ModelAndView mv = new ModelAndView();
			mv.addObject("funcionario", new Funcionario());
			mv.setViewName("lojadesonhos/formFuncionario");
			return mv;
		}
		
		@PostMapping("/salvarFuncionario")
		public String salvarFuncionario(Funcionario funcionario) {
			System.out.println(funcionario);
			fr.save(funcionario);
			return "lojadesonhos/funcionario-cadastrado";
		}

}
