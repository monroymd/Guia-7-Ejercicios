
package guia7ejercicio04;

import Rectangulo.Rectangulo;
import Service.RectanguloService;
import static Service.RectanguloService.dibujarRectangulo;
import static Service.RectanguloService.perimetro;
import static Service.RectanguloService.superficie;

/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/

public class Guia7Ejercicio04 {

    public static void main(String[] args) {
        
        RectanguloService nuevoRec = new RectanguloService();
        Rectangulo r1 = nuevoRec.crearRectangulo();
        Rectangulo r2 = nuevoRec.crearRectangulo();
        
        superficie(r1.getBase(), r1.getAltura());
        perimetro(r1.getBase(), r1.getAltura());
        dibujarRectangulo(r1.getBase(), r1.getAltura());
        
        superficie(r2.getBase(), r2.getAltura());
        perimetro(r2.getBase(), r2.getAltura());
        dibujarRectangulo(r2.getBase(), r2.getAltura());
        
    }
    
}
