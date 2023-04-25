/*
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
 */
package Service;

import Persona.Persona;
import java.util.Scanner;
import java.lang.IllegalArgumentException;


public class PersonaService {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    boolean validar = true;
    public Persona crearPersona(){
        Persona nuevaPersona = new Persona();
        
        System.out.println("Ingrese por favor el nombre de la persona");
        nuevaPersona.setNombre(leer.next());
        String sexo;
        
        do {
            System.out.println("Ingrese por favor el sexo de la persona, indicando M en el caso de mujer o H en el caso de hombre");
        sexo = leer.next();
        sexo = sexo.toUpperCase();
            if ("H".equals(sexo) || "M".equals(sexo)) {
                nuevaPersona.setSexo(sexo);
                validar = false;
            } else {
                System.out.println("indique solo M en el caso de mujer o H en el caso de hombre");
            }
        
        } while (validar);
        
        System.out.println("Ingrese por favor la edad de la persona");
        nuevaPersona.setEdad(leer.nextInt());
        
        System.out.println("Ingrese por favor el peso de la persona");
        nuevaPersona.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese por favor la altura de la persona");
        nuevaPersona.setAltura(leer.nextDouble());
        
        return nuevaPersona;
    }
    
    public static int calcularIMC(double peso, double altura){
        int valorImc = 0;
        double imc = peso/Math.pow(altura, 2);
        if (imc < 20) {
            valorImc = -1;
            return valorImc;
        } else if (imc >= 20 && imc <= 25) {
            valorImc = 0;
            return valorImc;
        } else if (imc > 25) {
            valorImc = 1;
            return valorImc;
        }return valorImc;
    }
    
    public static boolean esMayorDeEdad(int edad) /*throws IllegalAccessException*/{
        boolean mayor = false;
        try{
        if(edad == 0) throw new IllegalAccessException("la edad no puede ser 0");
        mayor = edad >= 18;
            
        } catch (IllegalAccessException iae){
            System.out.println(iae.getMessage());
            System.out.println(iae.fillInStackTrace());
        }
        return mayor;
        }
            
    } 
    
    

