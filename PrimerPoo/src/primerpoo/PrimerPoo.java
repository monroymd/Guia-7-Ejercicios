
package primerpoo;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Scanner;

public class PrimerPoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        PersonaService personaNueva = new PersonaService();
        
        Persona p1 = new Persona();
        
        Persona p2 = new Persona("Mario", "Monroy", 41);
        
        Persona p3 = new Persona ("Pepe", "Pepito", 27);
        
        System.out.println("El nombre de la Persona 2 es: "
                +p2.getNombre());
        System.out.println("El nombre de la persona 3 es "
                +p3.getNombre()+" y el apellido es "
                +p3.getApellido());
        System.out.println("Ingrese el apellido correcto de la "
                +"Persona 3");
        p3.setApellido(leer.next());
        System.out.println("El apellido ha cambiado a: "
                +p3.getNombre()+" "+ p3.getApellido());
        
        Persona p4 = personaNueva.crearPersona();
        
        System.out.println(p4.toString());
        System.out.println(p3);
        
    }
    
}
