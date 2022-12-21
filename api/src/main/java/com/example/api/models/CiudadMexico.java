package com.example.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ciudad_mexico")
public class CiudadMexico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String idpunto;

    private String programa;

    private String fecha_instalacion;

    private Float latitud;

    private Float longitud;

    private String colonia;

    private String alcaldia;


    public String getFecha_instalacion() {
        return fecha_instalacion;
    }

    public String getIdpunto() {
        return idpunto;
    }

    public void setIdpunto(String idpunto) {
        this.idpunto = idpunto;
    }

    public void setFecha_instalacion(String fecha_instalacion) {
        this.fecha_instalacion = fecha_instalacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getAlcaldia() {
        return alcaldia;
    }

    public void setAlcaldia(String alcaldia) {
        this.alcaldia = alcaldia;
    }

}
