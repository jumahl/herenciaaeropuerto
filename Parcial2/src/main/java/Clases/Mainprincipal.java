package Clases;

/**
 *
 * @author Juan
 */
public class Mainprincipal {

    public static void main(String[] args) {
        Pasajero pasajero1= new Pasajero("55", 250000,"100654","Juan","18","61fgdfg48");
        System.out.println(pasajero1);
        
        
        Azafata azafata1= new Azafata("1.75", 3, "15858", "Maria", "25", "s5g4dg7er8");
        System.out.println(azafata1);
        
        
        Pilotos pilosto1= new Pilotos(2500,"541578","Carlos","42", "561418df");
        System.out.println(pilosto1);
        
        
        Operario operario1= new Operario(4, "654885","Andres","25","651d9f18s");
        System.out.println(operario1);
    }
    
}
