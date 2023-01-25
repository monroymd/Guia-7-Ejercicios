
package guia7ejercicio01;

import Libro.Libro;
import LibroService.LibroService;
import static LibroService.LibroService.mostrarLibro;


public class Guia7Ejercicio01 {
    
    /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/
   
    public static void main(String[] args) {
        LibroService nuevoLibro = new LibroService();
        
        Libro libro01 = nuevoLibro.cargarLibro();
        
        System.out.println(libro01);
        
        mostrarLibro(libro01);
    }
    
}
