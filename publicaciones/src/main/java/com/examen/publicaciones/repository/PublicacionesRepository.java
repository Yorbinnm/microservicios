package com.examen.publicaciones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen.publicaciones.entity.Publicaciones;
@Repository
public interface PublicacionesRepository extends JpaRepository<Publicaciones, String> {
	@Query("select p from Publicaciones p where p.usuario_id like %?1%")
    List<Publicaciones> findByUsuario(String usuario_id);	
}
