package com.example.gestaoEscolar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GestaoEscolarControler {
	@RequestMapping(value ="/analisar", method = RequestMethod.POST)
	public ModelAndView somar(String nome, String curso) {
		ModelAndView mv = new ModelAndView("index");
		String curso1 = curso;
		String nome1 = nome;
		String resultado = "";
		
		
		
		if(curso1.equals("informatica")) {
			resultado = "sala 22";
		}else if(curso1.equals("alimentos")) {
			resultado = "sala21";
		}
		
		
		
		
		System.out.println(resultado);
		mv.addObject("resultado", resultado);
		return mv;
	}
}
