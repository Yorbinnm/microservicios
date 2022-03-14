package com.examen.mensajes.service;

import java.util.List;

import com.examen.mensajes.entity.Mensaje;
import com.examen.mensajes.models.MensajeDto;







public interface ServiceMensaje {
	Mensaje guardar(MensajeDto Datos);
	Mensaje consultar(String id);

	Mensaje modificar(String id, MensajeDto mensajeDto);
	void remover(String id);
	

}
