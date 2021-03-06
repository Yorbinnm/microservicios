
package com.examen.mensajes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen.mensajes.entity.Mensaje;


@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, String> {
	
}
