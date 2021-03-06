package com.examen.usuarios.models.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.usuarios.entity.Usuario;
import com.examen.usuarios.models.UsuarioDto;
import com.examen.usuarios.models.remote.PublicacionesDto;
import com.examen.usuarios.models.remote.ServicePublicacionRemote;
import com.examen.usuarios.models.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository usuarioRepository;
   
	private ServicePublicacionRemote servicePublicacionRemote;
    
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	
	}
	@Override
	public Usuario guardar(UsuarioDto usuarioDto) {
		Usuario usuario = Usuario.from(usuarioDto);
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario consultar(String id) {
		return usuarioRepository.findById(id)
				.orElseThrow(() -> UsuarioNoEncontradoException.from("No se encontro el usuario", id));
	}

	@Override
	public Usuario eliminar(String usuario_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> obtenerTodo() {
		return (List<Usuario>)usuarioRepository.findAll();
	}
	
	@Override
	public Usuario modificar(String id, UsuarioDto usuarioDto) {
		Usuario users = usuarioRepository.findById(id)
				.orElseThrow(() -> UsuarioNoEncontradoException.from("No se encontro el usuario", id));

		users = users.from(usuarioDto);

		users = usuarioRepository.save(users);

		return users;
	}
	
	public List<PublicacionesDto> publicacioness(String id){
        return servicePublicacionRemote.publicaciones_usuario(id);
    }
	
	

}
