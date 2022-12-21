package ifrn.pi.lojadesonhos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LojaController {
	
	//direciona para a página de formulário
	@RequestMapping("/lojadesonhos/form")
	public String form(){
		return "formLoja";
		
	}

}
