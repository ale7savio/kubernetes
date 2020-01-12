package com.ale7savio.kubernetes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@GetMapping("/holamundo")
	public String listar(){
		return "Hola Mundo";
	}
}
