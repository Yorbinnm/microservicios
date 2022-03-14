package com.examen.publicaciones.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.examen.publicaciones.entity.Publicaciones;
import com.examen.publicaciones.models.PublicacionesDto;
import com.examen.publicaciones.repository.PublicacionesRepository;


@Service
@Transactional
public class ServicePublicacionesImpl implements ServicePublicaciones {
	

	private PublicacionesRepository publicacionrepos;
	public ServicePublicacionesImpl(PublicacionesRepository publicacionrepos) {
		this.publicacionrepos = publicacionrepos;
	}
	@Override
	public Publicaciones guardar(PublicacionesDto Datos) {
		Publicaciones Publicacion = Publicaciones.from(Datos);
		return publicacionrepos.save(Publicacion);
	}

	@Override
	public Publicaciones consultar(String id) {
		return publicacionrepos.findById(id)
				.orElseThrow(() -> PublicacionNoEncontradaException.from("No se encontro la publicacion", id));
	}
	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Publicaciones> publicaciones_usuario(String id) {
		return (List<Publicaciones>) publicacionrepos.findByUsuario(id);
				
	}
	


		


	

}
