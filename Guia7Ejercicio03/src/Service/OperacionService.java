
package Service;

import Operacion.Operacion;
import java.util.Scanner;
/*d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/

public class OperacionService {
   
    Scanner leer = new Scanner(System.in);
    
    
    public Operacion nuevaOperacion () {
        Operacion nuevaOp = new Operacion();
        System.out.println("Ingrese el primer numero");
        nuevaOp.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        nuevaOp.setNum2(leer.nextInt());
        return nuevaOp;
}
    
    public static int sumar(int num1, int num2){
        int suma = num1 + num2;
        System.out.println("El resultado de la sumna entre "+num1+" y "+num2+ " es: "+ suma);
        return suma;
    }
    
    public static int restar(int num1, int num2){
        int resta = num1 - num2;
        System.out.println("El resultado de la resta entre "+num1+" y "+num2+ " es: "+ resta);
        return resta;
    } 
    
    public static int multiplicar (int num1, int num2){
        int multiplicar;
        if (num1>0 && num2>0 ) {
            multiplicar = num1 * num2;
            System.out.println("El resultado de la multiplicacion entre "+num1+" y "+num2+ " es: "+ multiplicar);
        } else {
            multiplicar = 0;
            System.out.println("Error, los valores a multiplicar deben ser mayores a 0");
        }
        return multiplicar;
    }
    
    public static int dividir (int num1, int num2){
        int dividir;
        if (num1>0 && num2>0 ) {
            dividir = num1 / num2;
            System.out.println("El resultado de la division entre "+num1+" y "+num2+ " es: "+ dividir);
        } else {
            dividir = 0;
            System.out.println("Error, los valores a dividir deben ser mayores a 0");
        }
        return dividir;
    
    
}
}