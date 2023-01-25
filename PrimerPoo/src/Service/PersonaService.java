
package Service;

import Entidad.Persona;
import java.util.Scanner;


public class PersonaService {
    
    Persona nuevaPersona = new Persona();
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la Persona");
        nuevaPersona.setNombre(leer.next());
        System.out.println("Ingre el apellido de la Persona");
        nuevaPersona.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona");
        nuevaPersona.setEdad(leer.nextInt());
        
        return nuevaPersona;
    }
    
}
