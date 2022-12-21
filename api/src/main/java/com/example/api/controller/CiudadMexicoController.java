package com.example.api.controller;

import com.example.api.models.CiudadMexico;
import com.example.api.services.CiudadMexicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class CiudadMexicoController {

    @Autowired
    private CiudadMexicoService service;

    /**
     *
     * @param page
     * @param id
     * @param colonia
     * @param latitud
     * @return
     */
    @PostMapping("/page/{page}")
    public Page<CiudadMexico> buscarColonia(@PathVariable Integer page, @RequestParam String id, @RequestParam String colonia, @RequestParam Float latitud, @RequestParam Float longitud){
        // Validamos si algunos de los parametros estan vacios si es asi mostramos toda la informacion de la tabla
        if(!colonia.isEmpty()){
            return service.findByColonia(PageRequest.of(page, 10), colonia);
        } else if (!id.isEmpty()) {
            return service.findByIdpunto(PageRequest.of(page, 10), id);
        }else if(latitud != 0 ) {
            return service.findByLatitudIsBefore(PageRequest.of(page, 10), latitud);
        }else if(longitud != 0){
          return service.findByLongitudIsBefore(PageRequest.of(page, 10), longitud);
        } else{
            return service.findAll(PageRequest.of(page, 10));
        }
    }
}
