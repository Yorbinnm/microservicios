package com.examen.usuarios.models.service;

import java.util.List;

import com.examen.usuarios.entity.Usuario;
import com.examen.usuarios.models.UsuarioDto;



public interface UsuarioService {
	Usuario guardar(UsuarioDto Datos);
	Usuario consultar(String id);
	Usuario eliminar(String id);
	List<Usuario> obtenerTodo();
	Usuario modificar(String id, UsuarioDto usuarioDto);
    
}

