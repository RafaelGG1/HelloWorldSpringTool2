package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Indica para o spring que essa é uma classe controladora
@RestController


//Indica um endpoint para nossa aplicação
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloworld() {
		return "Alo mundão";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "- Persistência\r\n"
				+ "- Mentalidade de Crescimento\r\n"
				+ "- Orientação ao Futuro\n"
				+ "- Responsabilidade Pessoal\r\n"
				+ "- Trabalho em Equipe\r\n"
				+ "- Comunicação\r\n"
				+ "- Comunicação Não Violenta\r\n"
				+ "- Atenção para Detalhes\r\n"
				+ "- Proatividade\r\n"
				+ "";
	
	}
	@GetMapping("/Objetivos")
	public String obj() {
		return "Aprendizado técnico com MySQL e Spring Boot, assim como a criação do blog pessoal";
	}

}
