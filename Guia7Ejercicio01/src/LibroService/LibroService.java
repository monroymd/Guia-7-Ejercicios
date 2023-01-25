
package LibroService;

import Libro.Libro;
import java.util.Scanner;

public class LibroService {
    
    Libro nuevoLibro = new Libro();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro() {
        System.out.println("Ingresar el numero ISBN");
        nuevoLibro.setISBN(leer.next());
        System.out.println("Ingresar el Titulo del Libro");
        nuevoLibro.setTítulo(leer.next());
        System.out.println("Ingresar el autor del Libro");
        nuevoLibro.setAutor(leer.next());
        System.out.println("Ingresar el numero de paginas del libro");
        nuevoLibro.setNumPaginas(leer.next());
        
        return nuevoLibro;
        
    }
    
    public static void mostrarLibro(Libro libro){
        System.out.println("El libro "+libro.getTítulo()+
                " escrito por "+libro.getAutor()+ " de "+
                libro.getNumPaginas()+ " paginas, esta identficado al ISBN "+
                libro.getISBN());
    }
}
