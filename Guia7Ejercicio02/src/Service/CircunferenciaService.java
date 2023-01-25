
package Service;

import Circunferencia.Circunferencia;
import java.util.Scanner;



public class CircunferenciaService {
    Scanner leer = new Scanner (System.in);
    
    
    public Circunferencia crearCircunferencia() {
        Circunferencia nuevaCircunferencia = new Circunferencia();
        System.out.println("Por favor, ingrese el valor del Radio");
        nuevaCircunferencia.setRadio(leer.nextInt());
        return nuevaCircunferencia;
        
        
}
    public static void area(int radio){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del Circulo es: "+area);
        
    }
   
    public static void perimetro(int radio){
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro del Circulo es: "+perimetro);
    }
    
}
