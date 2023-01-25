
package Servicio;

import java.util.Scanner;
import rodado.Auto.Auto;


public class AutoServicio {
    Scanner leer = new Scanner(System.in);
    public Auto altaAuto(){
        Auto nuevoAuto = new Auto();

        System.out.println("Ingrese la marca del rodado");
        nuevoAuto.setMarca(leer.next());

        System.out.println("Ingrese el modelo del rodado");
        nuevoAuto.setModelo(leer.next());

        System.out.println("Ingrese el año de fabricacion del rodado");
        nuevoAuto.setAño(leer.next());

        System.out.println("Ingrese el dominio del rodado");
        nuevoAuto.setDominio(leer.next());

        System.out.println("Ingrese la cilindrada del rodado");
        nuevoAuto.setCilindrada(leer.next());

        System.out.println("Ingrese la cantidad de puertas del rodado");
        nuevoAuto.setPuertas(leer.next());

        System.out.println("Ingrese el color del rodado");
        nuevoAuto.setColor(leer.next());

        return nuevoAuto;
    }
    
}
