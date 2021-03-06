package com.examen.comentarios.service;

import java.util.List;

import com.examen.comentarios.entity.Comentario;
import com.examen.comentarios.models.ComentarioDto;





public interface ServiceComentario {
	Comentario guardar(ComentarioDto Datos);
	Comentario consultar(String id);
	List<Comentario> comentariosPublicacion(String id);
	Comentario modificar(String id, ComentarioDto comentarioDto);
	void remover(String id);
	

}
