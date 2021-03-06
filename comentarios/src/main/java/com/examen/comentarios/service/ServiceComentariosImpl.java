package com.examen.comentarios.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.examen.comentarios.entity.Comentario;
import com.examen.comentarios.models.ComentarioDto;
import com.examen.comentarios.repository.ComentarioRepository;




@Service
@Transactional
public class ServiceComentariosImpl implements ServiceComentario {



	private ComentarioRepository comentarioRepository;
	public ServiceComentariosImpl(ComentarioRepository comentarioRepository) {
		this.comentarioRepository = comentarioRepository;
	}
	@Override
	public Comentario modificar(String id, ComentarioDto comentarioDto) {
		Comentario coment = comentarioRepository.findById(id)
				.orElseThrow(() -> PublicacionNoEncontradaException.from("No se encontro el comentario", id));

		coment = coment.from(comentarioDto);

		coment = comentarioRepository.save(coment);

		return coment;
	}
	@Override
	public Comentario guardar(ComentarioDto Datos) {
		Comentario coment = Comentario.from(Datos);
		return comentarioRepository.save(coment);
	}

	@Override
	public Comentario consultar(String id) {
		return comentarioRepository.findById(id)
				.orElseThrow(() -> PublicacionNoEncontradaException.from("No se encontro el comentario", id));
	}

	@Override
	public List<Comentario> comentariosPublicacion(String id) {
		return (List<Comentario>) comentarioRepository.findByPublicacion(id);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}
	

	


		


	

}
