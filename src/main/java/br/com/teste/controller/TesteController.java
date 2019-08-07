package br.com.teste.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.teste.dao.TarefaDao;
import br.com.teste.modelo.Tarefa;

@Controller
@Transactional
public class TesteController {

	@Qualifier("JpaTarefaDao")
	private TarefaDao dao;

	@Autowired
	public TesteController(TarefaDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println("Acesso identificado na Index.");
		ModelAndView index = new ModelAndView("index");
		index.addObject("message", "Eis aqui o conteúdo :D");
		return index;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("Acesso identificado na página Login.");
		ModelAndView login = new ModelAndView("login");
		login.addObject("message", "Eis aqui o conteúdo da página Login :D");
		return login;
	}
}
