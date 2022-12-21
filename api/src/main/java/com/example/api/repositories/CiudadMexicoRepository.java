package com.example.api.repositories;

import com.example.api.models.CiudadMexico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface CiudadMexicoRepository extends CrudRepository<CiudadMexico, Long> {
    Page<CiudadMexico> findAll(Pageable pageable);

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