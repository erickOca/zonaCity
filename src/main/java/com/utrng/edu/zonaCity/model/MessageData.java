package com.utrng.edu.zonaCity.model;
public class MessageData {

    private String usuario;
    private Double latitud;

    private Double longitud;
    public MessageData(String usuario, Double latitud, Double longitud) {
        this.usuario = usuario;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public MessageData() {

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

}