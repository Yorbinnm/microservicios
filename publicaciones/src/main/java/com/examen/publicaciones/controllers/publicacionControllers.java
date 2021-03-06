package com.examen.publicaciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.publicaciones.entity.Publicaciones;
import com.examen.publicaciones.models.PublicacionesDto;
import com.examen.publicaciones.models.TemplateResponse;
import com.examen.publicaciones.service.ServicePublicacionesImpl;





@RestController
@RequestMapping("publicacion/v1")
public class publicacionControllers {
	@Autowired
	private ServicePublicacionesImpl servicePublicacionesImpl;
	
	@PostMapping("/")
	public TemplateResponse crear(@RequestBody PublicacionesDto publicacionesDto) {
		Publicaciones publicacion = servicePublicacionesImpl.guardar(publicacionesDto);
		TemplateResponse response = new TemplateResponse("La publicacion se ha creado exitosamente", "200", publicacion);
		return response;
			
	}
	
	@GetMapping("/{id}")
	public Publicaciones consultarById(@PathVariable("id") String id) {
			return servicePublicacionesImpl.consultar(id);
	}

	@GetMapping("usuario/{id}")
	public List<Publicaciones> listaUsuarios(@PathVariable("id") String id) {
		return servicePublicacionesImpl.publicaciones_usuario(id);
	}
	

}
