package com.example.api.services;


import com.example.api.models.CiudadMexico;
import com.example.api.repositories.CiudadMexicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CiudadMexicoImpl implements CiudadMexicoService {

    @Autowired
    private CiudadMexicoRepository repository;

    /**
     *
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<CiudadMexico> findAll() {
        return (List<CiudadMexico>) repository.findAll();
    }

    /**
     *
     * @param pageable
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Page<CiudadMexico> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    /**
     *
     * @param colonia
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<CiudadMexico> findByColonia(String colonia) {
        return null;
    }

    /**
     *
     * @param pageable
     * @param colonia
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Page<CiudadMexico> findByColonia(Pageable pageable, String colonia) {
        return repository.findByColonia(pageable, colonia);
    }

    /**
     *
     * @param pageable
     * @param idpunto
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Page<CiudadMexico> findByIdpunto(Pageable pageable, String idpunto) {
        return repository.findByIdpunto(pageable, idpunto);
    }

    /**
     *
     * @param pageable
     * @param latitud
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Page<CiudadMexico> findByLatitudIsBefore(Pageable pageable, Float latitud) {
        return repository.findByLatitudIsBefore(pageable, latitud);
    }

    /**
     *
     * @param pageable
     * @param longitud
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Page<CiudadMexico> findByLongitudIsBefore(Pageable pageable, Float longitud) {
        return repository.findByLongitudIsBefore(pageable, longitud);
    }


}
