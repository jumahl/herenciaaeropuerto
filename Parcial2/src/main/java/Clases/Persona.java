/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Juan
 */
public abstract class Persona {
     protected String identificacion;
     protected String nombre;
     protected String edad;
     protected String numeroVuelo;
     
     public Persona(String identificacion, String nombre, String edad,String numeroVuelo){
         this.identificacion=identificacion;
         this.nombre=nombre;
         this.edad=edad;
         this.numeroVuelo=numeroVuelo;
     }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
     @Override
    public String toString() {
        return String.format("Ident:%s\n Nombre:%s\n Edad:%s años\n Numero de Vuelo:%s" ,
                getIdentificacion(), getNombre(), getEdad(), getNumeroVuelo());
               
    }
    
    public abstract int calcularCategoria();
    
}
