package com.examen.publicaciones.service;

import java.util.List;

import com.examen.publicaciones.entity.Publicaciones;
import com.examen.publicaciones.models.PublicacionesDto;



public interface ServicePublicaciones {
	Publicaciones guardar(PublicacionesDto Datos);
	Publicaciones consultar(String id);
	List<Publicaciones> publicaciones_usuario(String id);
	void remover(String id);
	

}
