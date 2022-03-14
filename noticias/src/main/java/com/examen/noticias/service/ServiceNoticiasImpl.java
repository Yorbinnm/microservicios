package com.examen.noticias.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.examen.noticias.entity.Noticias;
import com.examen.noticias.models.NoticiasDto;
import com.examen.noticias.repository.NoticiasRepository;


@Service
@Transactional
public class ServiceNoticiasImpl implements ServiceNoticias {
	

	private NoticiasRepository noticiasRepository;
	public ServiceNoticiasImpl(NoticiasRepository noticiasRepository) {
		this.noticiasRepository = noticiasRepository;
	}
	@Override
	public Noticias guardar(NoticiasDto Datos) {
		Noticias noticia = Noticias.from(Datos);
		return noticiasRepository.save(noticia);
	}

	@Override
	public Noticias consultar(String id) {
		return noticiasRepository.findById(id)
				.orElseThrow(() -> PublicacionNoEncontradaException.from("No se encontro la noticia", id));
	}
	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Noticias modificar(String id, NoticiasDto noticiasDto) {
		Noticias nots = noticiasRepository.findById(id)
				.orElseThrow(() -> PublicacionNoEncontradaException.from("No se encontro la noticia", id));

		nots = nots.from(noticiasDto);

		nots = noticiasRepository.save(nots);

		return nots;
	}

	


		


	

}
