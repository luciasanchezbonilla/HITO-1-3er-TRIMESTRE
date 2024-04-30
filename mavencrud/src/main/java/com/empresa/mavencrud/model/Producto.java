/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresa.mavencrud.model;

import java.util.Date;

/**
 *
 * @author CAMPUSFP
 */
public class Producto {
    
    //atributos - modificador de acceso
    //decoradores - anotaciones
    // programacion orientada a objetos - encapsulacion
    private int id;
    private String nombre;
    private float precio;
    private Date fecha;
    
    
    
    
    //constructor
    public Producto(int id, String nombre, float precio, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }
    
    //getter - setter
    // explicacion praactica de la encapsulacion en programacion orientada a objetos (POO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}//cierra la clase
