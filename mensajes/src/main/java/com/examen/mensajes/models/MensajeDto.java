package com.examen.mensajes.models;

public class MensajeDto {
	private String mensaje_id;
	private String usuario_id_emisor;
	private String usuario_id_receptor;
	public String getUsuario_id_receptor() {
		return usuario_id_receptor;
	}
	public void setUsuario_id_receptor(String usuario_id_receptor) {
		this.usuario_id_receptor = usuario_id_receptor;
	}
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
	
	
	
	
	
}
