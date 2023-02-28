/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Juan
 */
public class Azafata extends Persona  {
    private String estatura;
    private int cantidadIdiomas;
    private int categoriaAzaf;
    
    public Azafata(String estatura,int cantidadIdiomas,
            String identificacion, String nombre, String edad,String numeroVuelo){
        super(identificacion,nombre,edad,numeroVuelo);
        this.cantidadIdiomas=cantidadIdiomas;
        this.estatura=estatura;
        this.categoriaAzaf=0;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public int getCantidadIdiomas() {
        return cantidadIdiomas;
    }

    public void setCantidadIdiomas(int cantidadIdiomas) {
        this.cantidadIdiomas = cantidadIdiomas;
    }

    public int getCategoriaAzaf() {
        if(cantidadIdiomas==2)
        {
        categoriaAzaf= 1;
        }
        else{if(cantidadIdiomas==3)
        {
            categoriaAzaf=2;
        }else{if(cantidadIdiomas>3)
        {
        categoriaAzaf=3;
        }
        }
        }
        
        return categoriaAzaf;
    }
    

    @Override
    public int calcularCategoria() {
        return getCategoriaAzaf();
    }
    
    @Override 
    public String toString() { 
        return String.format("Azafata:\n%s\nEstatura:%s mts\nCantidad de Idionas que habla:%s\n%s\nCategoria Azafata:%s\n", super.toString(),getEstatura(),getCantidadIdiomas(), 
                              "Categoria Azafata, Aprandiz:1, Auxiliar:2,  Titular:3:", getCategoriaAzaf());}
    
}
