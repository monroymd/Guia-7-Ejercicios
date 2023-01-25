
package Service;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada. 

 */
public class CafeteraService {
    
    public static int llenarCafetera( ){
        int nivelActual = 1000;
        return nivelActual;
    }
    
    public static int servirTaza(int nivel){
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese el tamaño de la taza en cm3");
        int taza = leer.nextInt();
        if (taza<nivel) {
            int resto = nivel - taza;
            return resto;
        } else {
            System.out.println("La cantidad de cafe no logra llenar la taza deseada");
            int resto = 0;
            return resto;
        }    
    }
    
    public static int vaciarCafetera(){
        int cafe = 0;
        return cafe;
    }
    
    public static int agregarCafe(int nivelActual){
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor, indique la cantidad de cafe a agregar");
        int cafe = leer.nextInt();
        int nuevoNivel = cafe + nivelActual;
        if (nuevoNivel<1000) {
            return nuevoNivel;
        } else {
            nuevoNivel = 1000;
            return nuevoNivel;
        }
        }
}
