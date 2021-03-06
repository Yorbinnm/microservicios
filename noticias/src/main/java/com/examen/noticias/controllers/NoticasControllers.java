package com.examen.noticias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.examen.noticias.entity.Noticias;
import com.examen.noticias.models.NoticiasDto;
import com.examen.noticias.models.TemplateResponse;
import com.examen.noticias.service.ServiceNoticiasImpl;






@RestController
@RequestMapping("noticias/v1")
public class NoticasControllers {
	@Autowired
	private ServiceNoticiasImpl serviceImpl;
	
	@PostMapping("/")
	public TemplateResponse crear(@RequestBody NoticiasDto publicacionesDto) {
		Noticias publicacion = serviceImpl.guardar(publicacionesDto);
		TemplateResponse response = new TemplateResponse("La noticia se ha creado exitosamente", "200", publicacion);
		return response;
			
	}
	
	@GetMapping("/{id}")
	public Noticias consultarById(@PathVariable("id") String id) {
			return serviceImpl.consultar(id);
	}

	@PutMapping("/{id}")
	public TemplateResponse modificar(@PathVariable("id") String id, @RequestBody NoticiasDto noticiasDto) {
		

		Noticias noticia = serviceImpl.modificar(id, noticiasDto);
		TemplateResponse response = new TemplateResponse("La notici se ha actualizado exitosamente", "200", noticia);

		return response;

	}
	

}
