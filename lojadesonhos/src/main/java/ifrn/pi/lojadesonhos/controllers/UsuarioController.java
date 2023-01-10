package ifrn.pi.lojadesonhos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.lojadesonhos.models.Usuario;
import ifrn.pi.lojadesonhos.repositories.UsuarioRepository;

@Controller
@RequestMapping("lojadesonhos")
public class UsuarioController {
	
	private UsuarioRepository ur;
	
	@GetMapping("/formUsuario")
	public ModelAndView loginUsuario() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("usuario", new Usuario());
		mv.setViewName("lojadesonhos/formUsuario");
		return mv;
	}
	
	@PostMapping("/salvarUsuario")
	public String salvarCliente(Usuario usuario) {
		System.out.println(usuario);
		ur.save(usuario);
		return "lojadesonhos/usuario-cadastrado";
	}
	

}
