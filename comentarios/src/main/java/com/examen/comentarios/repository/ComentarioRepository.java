
package com.examen.comentarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen.comentarios.entity.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, String> {
	@Query("select c from Comentario c where c.publicacion_id like %?1%")
    List<Comentario> findByPublicacion(String usuario_id);	
}
