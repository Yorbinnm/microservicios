package com.examen.publicaciones.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.examen.publicaciones.models.PublicacionesDto;

@Entity
@Table(name = "publicacion")
public class Publicaciones implements  Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String publicacion_id;
	private String usuario_id;
	private String mensaje;

	
	public String getPublicacion_id() {
		return publicacion_id;
	}
	public void setPublicacion_id(String publicacion_id) {
		this.publicacion_id = publicacion_id;
	}
	public String getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(String usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static Publicaciones from(PublicacionesDto publicacionDto) {
		Publicaciones publica = new Publicaciones();
		publica.setMensaje(publicacionDto.getMensaje());
		publica.setUsuario_id(publicacionDto.getUsuario_id());
		return publica;
	}
	


}
