
package Libro;


public class Libro {
    
    private String ISBN;
    private String Título;
    private String Autor;
    private String NumPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String Título, String Autor, String NumPaginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(String NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Título + ", Autor=" + Autor + ", NumPaginas=" + NumPaginas + '}';
    }
    
    
    
}
