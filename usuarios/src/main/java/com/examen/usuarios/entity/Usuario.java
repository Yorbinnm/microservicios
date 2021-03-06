package com.examen.usuarios.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.examen.usuarios.models.UsuarioDto;

@Entity
@Table(name = "usuarios")
public class Usuario implements  Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String usuario_id;
	private String nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private String username;
	private String contrasena;
	
	public Usuario(String usuario_id, String nombre, String primer_apellido, String segundo_apellido, String username,
			String contrasena) {
		this.usuario_id = usuario_id;
		this.nombre = nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.username = username;
		this.contrasena = contrasena;
	}

	public Usuario() {

	}

	public String getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(String usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public static Usuario from(UsuarioDto usuarioDto) {
		Usuario users = new Usuario();
		users.setNombre(usuarioDto.getNombre());
		users.setPrimer_apellido(usuarioDto.getPrimer_apellido());
		users.setSegundo_apellido(usuarioDto.getSegundo_apellido());
		users.setContrasena(usuarioDto.getContrasena());
		users.setUsername(usuarioDto.getUsername());
		return users;
	}

	
	
	

}
