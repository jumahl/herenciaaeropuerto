/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Juan
 */
public class Operario extends Persona{
    private int antiguedad;
    private int categoriaOpe;
    
    public Operario(int antiguedad,
            String identificacion, String nombre, String edad,String numeroVuelo){
        super(identificacion,nombre,edad,numeroVuelo);
        this.antiguedad=antiguedad;
        this.categoriaOpe=0;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getCategoriaOpe() {
        if(antiguedad<2)
        {
        categoriaOpe= 1;
        }
        else{if(antiguedad>=2&&antiguedad<6)
        {
            categoriaOpe=2;
        }else{if(antiguedad>=6)
        {
        categoriaOpe=3;
        }
        }
        }
        return categoriaOpe;
    }
    

    @Override
    public int calcularCategoria() {
       return getCategoriaOpe();
    }
    @Override 
    public String toString() { 
        return String.format("Operario:\n%s\nAntiguenad:%s Años\n%s\nCategoria Operario:%s", super.toString(),getAntiguedad(),
                              "Categoria Operario, Principiante=1, Novato=2, Experimentado=3:", getCategoriaOpe(),"\n");}
    
}
