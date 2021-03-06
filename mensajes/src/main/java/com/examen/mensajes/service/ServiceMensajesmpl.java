package com.examen.mensajes.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.examen.mensajes.entity.Mensaje;
import com.examen.mensajes.models.MensajeDto;
import com.examen.mensajes.repository.MensajeRepository;






@Service
@Transactional
public class ServiceMensajesmpl implements ServiceMensaje {



	private MensajeRepository mensajeRepository;
	public ServiceMensajesmpl(MensajeRepository mensajeRepository) {
		this.mensajeRepository = mensajeRepository;
	}
	@Override
	public Mensaje modificar(String id, MensajeDto mensajeDto) {
		Mensaje coment = mensajeRepository.findById(id)
				.orElseThrow(() -> PublicacionNoEncontradaException.from("No se encontro el mensaje", id));

		coment = coment.from(mensajeDto);

		coment = mensajeRepository.save(coment);

		return coment;
	}
	@Override
	public Mensaje guardar(MensajeDto Datos) {
		Mensaje coment = Mensaje.from(Datos);
		return mensajeRepository.save(coment);
	}

	@Override
	public Mensaje consultar(String id) {
		return mensajeRepository.findById(id)
				.orElseThrow(() -> PublicacionNoEncontradaException.from("No se encontro el comentario", id));
	}
	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}


	

	


		


	

}
