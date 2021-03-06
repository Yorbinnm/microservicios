package com.examen.usuarios.models.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.usuarios.entity.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {
	Optional<Usuario> findById(String id);

}
