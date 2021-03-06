package com.examen.usuarios.models.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;


import java.util.List;

import javax.transaction.Transactional;
@Service
@FeignClient(name = "publicaciones",url="localhost:8082")
public interface ServicePublicacionRemote {
    @RequestMapping(method = GET, value = "/publicacion/v1/usuario/{id}", produces = "application/json")
    List<PublicacionesDto> publicaciones_usuario(@PathVariable String id);
}
