package com.example.api.services;

import com.example.api.models.CiudadMexico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CiudadMexicoService {

    /**
     *
     * @return
     */
    List<CiudadMexico> findAll();

    /**
     *
     * @param pageable
     * @return
     */
    Page<CiudadMexico> findAll(Pageable pageable);

    /**
     *
     * @param colonia
     * @return
     */
    List<CiudadMexico> findByColonia(String colonia);

    /**
     *
     * @param pageable
     * @param colonia
     * @return
     */
    Page<CiudadMexico> findByColonia(Pageable pageable, String colonia);

    /**
     *
     * @param pageable
     * @param idpunto
     * @return
     */
    Page<CiudadMexico> findByIdpunto(Pageable pageable, String idpunto);

    /**
     *
     * @param pageable
     * @param latitud
     * @return
     */
    Page<CiudadMexico> findByLatitudIsBefore(Pageable pageable, Float latitud);

    /**
     *
     * @param pageable
     * @param longitud
     * @return
     */
    Page<CiudadMexico> findByLongitudIsBefore(Pageable pageable, Float longitud);

}
