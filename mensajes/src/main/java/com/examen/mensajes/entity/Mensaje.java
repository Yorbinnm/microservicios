package com.examen.mensajes.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.examen.mensajes.models.MensajeDto;

@Entity
@Table(name = "mensajes")
public class Mensaje implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String mensaje_id;
	private String usuario_id_emisor;
	private String usuario_id_receptor;
	private String mensaje;

	public String getMensaje_id() {
		return mensaje_id;
	}

	public void setMensaje_id(String mensaje_id) {
		this.mensaje_id = mensaje_id;
	}

	public String getUsuario_id_emisor() {
		return usuario_id_emisor;
	}

	public void setUsuario_id_emisor(String usuario_id_emisor) {
		this.usuario_id_emisor = usuario_id_emisor;
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

 
	

	public String getUsuario_id_receptor() {
		return usuario_id_receptor;
	}

	public void setUsuario_id_receptor(String usuario_id_receptor) {
		this.usuario_id_receptor = usuario_id_receptor;
	}

	public Mensaje() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Mensaje(String mensaje_id, String usuario_id_emisor, String usuario_id_receptor, String mensaje) {
		super();
		this.mensaje_id = mensaje_id;
		this.usuario_id_emisor = usuario_id_emisor;
		this.usuario_id_receptor = usuario_id_receptor;
		this.mensaje = mensaje;
	}

	public static Mensaje from(MensajeDto mensajeDto) {
		Mensaje coment = new Mensaje();
		coment.setMensaje(mensajeDto.getMensaje());
		coment.setUsuario_id_emisor(mensajeDto.getUsuario_id_emisor());
		coment.setUsuario_id_receptor(mensajeDto.getUsuario_id_receptor());
		
		return coment;
	}

}
