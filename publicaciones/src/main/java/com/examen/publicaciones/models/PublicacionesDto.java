package com.examen.publicaciones.models;

public class PublicacionesDto {
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
	

}
