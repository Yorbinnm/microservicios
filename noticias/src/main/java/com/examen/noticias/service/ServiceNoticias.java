package com.examen.noticias.service;

import java.util.List;


import com.examen.noticias.entity.Noticias;
import com.examen.noticias.models.NoticiasDto;



public interface ServiceNoticias {
	Noticias guardar(NoticiasDto Datos);
	Noticias consultar(String id);
	Noticias modificar(String id, NoticiasDto noticiasDto);
	void remover(String id);
	

}
