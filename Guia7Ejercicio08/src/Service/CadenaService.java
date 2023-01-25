/*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Service;

import java.util.Scanner;


public class CadenaService {
    
    public static void mostrarVocales(String frase){
        int cont = 0;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i,i+1)){
                case "a":
                    cont += 1;
                    break;
                case "e":
                    cont += 1;
                    break;
                case "i":
                    cont += 1;
                    break;
                case "o":
                    cont += 1;
                    break;
                case "u":
                    cont += 1;
                    break;
                    
            }
        } System.out.println("La frase contiene "+cont+" vocales.");
        
        
    }
    
    public static void invertirFrase(String frase){
        String invert = frase.substring(frase.length()-1, frase.length());
        
        for (int i = frase.length()-2; i >= 0; i--) {
            invert = invert + frase.substring(i, i+1);    
        }
        System.out.println("La frase invertida queda de la siguiente manera: "+invert);
    }
    
    public static void vecesRepetido(String frase, String letra){
        int cont = 0;
        
        for (int i = 0; i < frase.length(); i++) {
                if (frase.substring(i, i+1).equals(letra)) {
                    cont += 1;
                }
            }System.out.println("La letra "+letra+" se repite "+cont+" veces.");
        }
        

    public static void compararLongitud(String frase) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase para comparar su longitud");
        String nuevaFrase = leer.next();
        
        if (frase.length() == nuevaFrase.length()) {
            System.out.println("Las frases tienen la misma longitud");
        } else if (frase.length() < nuevaFrase.length()) {
            System.out.println("Su frase posee una longitud superior");
        } else {
            System.out.println("Su frase posee una longitud inferior");
        }
    }
    
    
    public static void reemplazar(String frase){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nuevaFrase;
        System.out.println("Ingrese una letra para cambiar");
        String letra = leer.next();
        frase = frase.toLowerCase();
        
        if (frase.substring(0, 1).equals("a")) {
                nuevaFrase = letra;
            } else {
                nuevaFrase = frase.substring(0, 1);
        }
        for (int i = 1; i < frase.length(); i++) {
            if (frase.substring(i, i+1).equals("a")) {
                nuevaFrase = nuevaFrase + letra;
            } else {
                nuevaFrase = nuevaFrase + frase.substring(i, i+1);
            }
            
        }

        System.out.println("La Nueva frase con la letra intercambiada queda de la siguiente manera: "+nuevaFrase);
    
    }
    public static void unirFrases(String frase){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese la frase a unir");
        String nuevaFrase = frase + " " + leer.next();
        System.out.println("La frase unida queda de la siguente manera:");
        System.out.println(nuevaFrase);
    }
    
//    Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public static boolean contiene(String frase){
        boolean verificar = true;
        Scanner leer = new Scanner (System.in);
        String letra;
        do {
            System.out.println("ingrese la letra a buscar");
            letra = leer.next();
            } while (letra.length() != 1);
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i+1).equals(letra)) {
                verificar = true;
                break;
            } else {
                verificar = false;
            }
        }
        
        return verificar;
        
    }
    
    
    }
    
    
    


