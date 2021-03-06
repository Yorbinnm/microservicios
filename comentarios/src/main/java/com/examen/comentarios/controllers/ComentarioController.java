package com.examen.comentarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.comentarios.entity.Comentario;
import com.examen.comentarios.models.ComentarioDto;
import com.examen.comentarios.models.TemplateResponse;
import com.examen.comentarios.service.ServiceComentariosImpl;

@RestController
@RequestMapping("comentarios/v1")
public class ComentarioController {
	@Autowired
	private ServiceComentariosImpl serviceComentariosnesImpl;
	
	@PostMapping("/")
	public TemplateResponse crear(@RequestBody ComentarioDto comentarioDto) {
		Comentario publicacion = serviceComentariosnesImpl.guardar(comentarioDto);
		TemplateResponse response = new TemplateResponse("El comentario se ha creado exitosamente", "200", publicacion);
		return response;
			
	}
	@GetMapping("publicacion/{id}")
	public List<Comentario> listacomentarios(@PathVariable("id") String id) {
		return serviceComentariosnesImpl.comentariosPublicacion(id);
	}
	@GetMapping("/{id}")
	public Comentario consultarById(@PathVariable("id") String id) {
			return serviceComentariosnesImpl.consultar(id);
	}
	@PutMapping("/{id}")
	public TemplateResponse modificar(@PathVariable("id") String id, @RequestBody ComentarioDto comentarioDto) {
		

		Comentario coments = serviceComentariosnesImpl.modificar(id, comentarioDto);
		TemplateResponse response = new TemplateResponse("El comentario se ha actualizado exitosamente", "200", coments);

		return response;

	}

}
