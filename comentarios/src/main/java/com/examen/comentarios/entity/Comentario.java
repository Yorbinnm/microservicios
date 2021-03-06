package com.examen.comentarios.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.examen.comentarios.models.ComentarioDto;


@Entity
@Table(name = "comentarios")
public class Comentario implements  Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String comentario_id;
	private String usuario_id;
	private String publicacion_id;
	private String mensaje;
	public String getComentario_id() {
		return comentario_id;
	}
	public void setComentario_id(String comentario_id) {
		this.comentario_id = comentario_id;
	}
	public String getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(String usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getPublicacion_id() {
		return publicacion_id;
	}
	public void setPublicacion_id(String publicacion_id) {
		this.publicacion_id = publicacion_id;
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
	public Comentario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comentario(String comentario_id, String usuario_id, String publicacion_id, String mensaje) {
		super();
		this.comentario_id = comentario_id;
		this.usuario_id = usuario_id;
		this.publicacion_id = publicacion_id;
		this.mensaje = mensaje;
	}
	
	public static Comentario from(ComentarioDto comentarioDto) {
		Comentario coment = new Comentario();
		coment.setMensaje(comentarioDto.getMensaje());
		coment.setUsuario_id(comentarioDto.getUsuario_id());
		coment.setPublicacion_id(comentarioDto.getPublicacion_id());
		
		return coment;
	}
	
}
