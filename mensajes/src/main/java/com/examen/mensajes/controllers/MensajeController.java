package com.examen.mensajes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.mensajes.entity.Mensaje;
import com.examen.mensajes.models.MensajeDto;
import com.examen.mensajes.models.TemplateResponse;
import com.examen.mensajes.service.ServiceMensajesmpl;


@RestController
@RequestMapping("mensajes/v1")
public class MensajeController {
	@Autowired
	private ServiceMensajesmpl servicesImpl;
	
	@PostMapping("/")
	public TemplateResponse crear(@RequestBody MensajeDto mensajeDto) {
		Mensaje msg = servicesImpl.guardar(mensajeDto);
		TemplateResponse response = new TemplateResponse("El mensaje se ha creado exitosamente", "200", msg);
		return response;
			
	}
	
	@GetMapping("/{id}")
	public Mensaje consultarById(@PathVariable("id") String id) {
			return servicesImpl.consultar(id);
	}
	@PutMapping("/{id}")
	public TemplateResponse modificar(@PathVariable("id") String id, @RequestBody MensajeDto mensajeDto) {
		

		Mensaje msg = servicesImpl.modificar(id, mensajeDto);
		TemplateResponse response = new TemplateResponse("El mensaje se ha actualizado exitosamente", "200", msg);

		return response;

	}

}
