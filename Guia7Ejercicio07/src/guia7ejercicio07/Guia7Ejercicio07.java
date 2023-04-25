/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
*/
package guia7ejercicio07;

import Persona.Persona;
import Service.PersonaService;


public class Guia7Ejercicio07 {

    
    public static void main(String[] args) /*throws IllegalAccessException*/ {
        
        PersonaService nuevaPersona = new PersonaService();
        
        int mayores = 0, menores = 0, sobrepeso = 0, pesoIdeal = 0, bajoPeso = 0;
        
        Persona p1 = nuevaPersona.crearPersona();
//        Persona p2 = nuevaPersona.crearPersona();
//        Persona p3 = nuevaPersona.crearPersona();
//        Persona p4 = nuevaPersona.crearPersona();
        
        int p1IMC = PersonaService.calcularIMC(p1.getPeso(), p1.getAltura());
        switch (p1IMC) {
            case -1:
                bajoPeso += 1;
                break;
            case 0:
                pesoIdeal += 1;
                break;
            case 1:
                sobrepeso += 1;
                break;
            default:
                break;
        }
        
//        int p2IMC = PersonaService.calcularIMC(p2.getPeso(), p2.getAltura());
//        if (p2IMC == -1) {
//            bajoPeso += 1;
//        } else if (p2IMC == 0) {
//            pesoIdeal += 1;
//        } else if (p2IMC == 1) {
//            sobrepeso += 1;
//        }
//        
//        int p3IMC = PersonaService.calcularIMC(p3.getPeso(), p3.getAltura());
//        if (p3IMC == -1) {
//            bajoPeso += 1;
//        } else if (p3IMC == 0) {
//            pesoIdeal += 1;
//        } else if (p3IMC == 1) {
//            sobrepeso += 1;
//        }
//        
//        int p4IMC = PersonaService.calcularIMC(p4.getPeso(), p4.getAltura());
//        if (p4IMC == -1) {
//            bajoPeso += 1;
//        } else if (p4IMC == 0) {
//            pesoIdeal += 1;
//        } else if (p4IMC == 1) {
//            sobrepeso += 1;
//        }
        
        if (PersonaService.esMayorDeEdad(p1.getEdad())) {
            mayores += 1;
        } else {
            menores += 1;
        }
//        if (PersonaService.esMayorDeEdad(p2.getEdad())) {
//            mayores += 1;
//        } else {
//            menores += 1;
//        }
//        if (PersonaService.esMayorDeEdad(p3.getEdad())) {
//            mayores += 1;
//        } else {
//            menores += 1;
//        }
//        if (PersonaService.esMayorDeEdad(p4.getEdad())) {
//            mayores += 1;
//        } else {
//            menores += 1;
//        }
        
        System.out.println("De las 4 personas, "+sobrepeso+ " de ellas se encuentran con sobreso, "
                +pesoIdeal+" con peso ideal y "+bajoPeso+" con bajo peso. Mientras que "+mayores
                +" son mayores de edad y "+menores+" son menores de edad");
        System.out.println("");
    }
        
    
}
