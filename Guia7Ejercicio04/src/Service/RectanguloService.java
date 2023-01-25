
package Service;

import Rectangulo.Rectangulo;
import java.util.Scanner;


public class RectanguloService {
    
    Scanner leer = new Scanner (System.in);
    
    public Rectangulo crearRectangulo(){
        Rectangulo nuevoRec = new Rectangulo();
        System.out.println("Por favor ingrese la Base del nuevo rectangulo");
        nuevoRec.setBase(leer.nextDouble());
        System.out.println("Por favor ingrese la Altura del rectangulo nuevo");
        nuevoRec.setAltura(leer.nextDouble());
        
        return nuevoRec;
    }
    
    public static void superficie(double base, double altura){
        double superficie = base * altura;
        System.out.println("La superficie el rectangulo es: "+superficie);
    }
    
    public static void perimetro(double base, double altura){
        double perimetro = (base + altura)*2;
        System.out.println("El Perimetro del rectangulo es: "+perimetro);
    }
    
    public static void dibujarRectangulo(double base, double altura){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura-1 || j == 0 || j == base-1) {
                    System.out.print("*");
                    } else {
                    System.out.print(" ");
                }
                    }System.out.println(" ");
                }System.out.println(" ");
            }
        }
    
    

