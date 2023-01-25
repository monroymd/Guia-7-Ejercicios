
package rodado;


import Servicio.AutoServicio;
import Servicio.UsuarioServicio;
import rodado.Auto.Auto;
import rodado.Auto.Usuario;
import java.util.Scanner;

public class Rodado {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Auto a1 = new Auto("Chevrolet", "Corsa", "2006", "GEM803", "1.6", "4", "Gris");
        
        UsuarioServicio us = new UsuarioServicio();
        Usuario u1 = us.altaUsuario();
        
        AutoServicio as = new AutoServicio();
        Auto a1 = as.altaAuto();
        
        Auto a2 = as.altaAuto();
        
        System.out.println(u1);
        us.edad(u1);
        System.out.println(a1);
        System.out.println("------------");
        System.out.println(a2);
        
    }
    
}
