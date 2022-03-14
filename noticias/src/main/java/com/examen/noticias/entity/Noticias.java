package com.examen.noticias.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.examen.noticias.models.NoticiasDto;

@Entity
@Table(name = "noticias")
public class Noticias implements  Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String noticia_id;
	private String mensaje;
	private String titulo;
	
	
	public String getNoticia_id() {
		return noticia_id;
	}
	public void setNoticia_id(String noticia_id) {
		this.noticia_id = noticia_id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public static Noticias from(NoticiasDto publicacionDto) {
		Noticias publica = new Noticias();
		publica.setMensaje(publicacionDto.getMensaje());
		publica.setTitulo(publicacionDto.getTitulo());
		return publica;
	}
	


}
