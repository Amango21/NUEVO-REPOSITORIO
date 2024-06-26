package com.example.gesvet.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String imagen;
    private String color;
    private String edad;
    private String tiempo;
    private String genero;
    private String detalles;
    private boolean activo = true;

    // Mapeo de Especie
    @ManyToOne
    @JoinColumn(name = "especie_id")
    @JsonIgnoreProperties("mascotas")
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonIgnore// "mascotas" es el nombre del campo en la clase User que hace referencia a las mascotas
    private User usuario;
    // Mapeo de razas
    @ManyToOne
    @JoinColumn(name = "raza_id")
    @JsonIgnoreProperties("mascotas")
    private Raza raza;

    public Mascota(int par, String string, String string1, String string2, String string3, String string4, String string5) {
    }

    public Mascota() {
    }

    public Mascota(Integer id, String nombre, String imagen, String color, String edad, String tiempo, String genero, String detalles, Especie especie, User usuario, Raza raza) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.color = color;
        this.edad = edad;
        this.tiempo = tiempo;
        this.genero = genero;
        this.detalles = detalles;
        this.activo = true;
        this.especie = especie;
        this.usuario = usuario;
        this.raza = raza;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + ", color=" + color + ", edad=" + edad + ", tiempo=" + tiempo + ", genero=" + genero + ", detalles=" + detalles + ", especie=" + especie + ", usuario=" + usuario + ", raza=" + raza + '}';
    }
}
