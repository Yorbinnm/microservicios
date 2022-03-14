package com.examen.noticias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen.noticias.entity.Noticias;
@Repository
public interface NoticiasRepository extends JpaRepository<Noticias, String> {
		
}
