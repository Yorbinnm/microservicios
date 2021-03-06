package com.examen.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.examen.usuarios.entity.Usuario;
import com.examen.usuarios.models.TemplateResponse;
import com.examen.usuarios.models.UsuarioDto;
import com.examen.usuarios.models.remote.PublicacionesDto;
import com.examen.usuarios.models.service.UsuarioServiceImpl;

@RestController
@RequestMapping("usuarios/v1")
public class UsuariosController {
	@Autowired
	private UsuarioServiceImpl usuarioImpl;
	
    @GetMapping()
	public List<Usuario> listaUsuarios() {
		return usuarioImpl.obtenerTodo();
	}
    
	@GetMapping("/{id}")
	public Usuario consultarById(@PathVariable("id") String id) {
			return usuarioImpl.consultar(id);
	}
	
	@RequestMapping("/hola")
	public Object first() {
		return "first controller";
	}
	
	@PostMapping
	public TemplateResponse crear(@RequestBody UsuarioDto usuarioDto) {
	Usuario usuario = usuarioImpl.guardar(usuarioDto);
	
		TemplateResponse response = new TemplateResponse("El usuario se ha creado exitosamente", "200", usuario);

		return response;
	}
	
	@PutMapping("/{id}")
	public TemplateResponse modificar(@PathVariable("id") String id, @RequestBody UsuarioDto usuarioDto) {
		

		Usuario users = usuarioImpl.modificar(id, usuarioDto);
		TemplateResponse response = new TemplateResponse("El usuario se ha actualizado exitosamente", "200", users);

		return response;

	}
	@GetMapping("/publicaciones/{id}")
	public List<PublicacionesDto> listaPublicaciones(@PathVariable("id") String id) {
		return usuarioImpl.publicacioness(id);
	}
	
	


}
