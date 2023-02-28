/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Juan
 */
public class Pasajero extends Persona {
    private String numeroAsiento;
    private int valorPasaje;
    private int categoriaPass;
    
    public Pasajero(String numeroAsiento,int valorPasaje, 
    String identificacion, String nombre, String edad,String numeroVuelo){
        
        super(identificacion,nombre,edad,numeroVuelo);
        this.numeroAsiento=numeroAsiento;
        this.valorPasaje=valorPasaje;
        this.categoriaPass=0;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int getCategoriaPass() {
        if(valorPasaje<250000)
        {
        categoriaPass= 1;
        }
        else{if(valorPasaje>=250000&&valorPasaje<450000)
        {
            categoriaPass=2;
        }else{if(valorPasaje>=450000)
        {
        categoriaPass=3;
        }
        }
        }
        return categoriaPass;
    }
    

    @Override
    public int calcularCategoria() {
 
        return getCategoriaPass();
    }
    
    @Override 
    public String toString() { 
        return String.format("Pasajero:\n%s\n%s\nCategoria pasajero:%s\nNumero de Asiento:%s\nValor Pasaje:%s \n", super.toString(), 
                              "Categoria pasajero: Economica:1, Convenio:2, Primera clase:3", getCategoriaPass(),getNumeroAsiento(),getValorPasaje());}
    
    
}
