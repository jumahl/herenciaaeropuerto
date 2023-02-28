/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Juan
 */
public class Pilotos extends Persona{
    private int horasVuelo;
    private int categoriaPil;
    
    public Pilotos(int horasVuelo,
            String identificacion, String nombre, String edad,String numeroVuelo){
        super(identificacion,nombre,edad,numeroVuelo);
        this.horasVuelo=horasVuelo;
        this.categoriaPil=0;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public int getCategoriaPil() {
        if(horasVuelo<=1500){
        categoriaPil=1;
        }else{
        if(horasVuelo>1500){
        categoriaPil=2;}
        }
        return categoriaPil;
    }
    

    @Override
    public int calcularCategoria() {
      return getCategoriaPil();
    }
    @Override 
    public String toString() { 
        return String.format("Piloto:\n%s\nhoras de Vuelo:%s\n%s\nCategoria Piloto:%s\n", super.toString(),getHorasVuelo(),
                              "Categoria Piloto, Primer piloto:1, Capitan:2", getCategoriaPil());}
    
}
