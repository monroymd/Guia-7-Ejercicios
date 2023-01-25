
package Servicio;

import java.util.Date;
import java.util.Scanner;
import rodado.Auto.Usuario;


public class UsuarioServicio {
    
    public Usuario altaUsuario(){
    Usuario u1 = new Usuario ();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        System.out.println("Ingrese el nombre del nuevo usuario");
        u1.setNombre(leer.next());
        
        System.out.println("Ingrese el apellido del nuevo usuario");
        u1.setApellido(leer.next());
        
        System.out.println("Ingrese el DNI del nuevo usuario");
        u1.setDni(leer.next());
        
        System.out.println("Ingrese el dia de nacimiento del nuevo usuario");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento del nuevo usuario");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento del nuevo usuario");
        int año = leer.nextInt();
        Date fecha = new Date (año-1900,mes-1,dia);
        u1.setNacimiento(fecha);
        
        System.out.println("Ingrese el domicilio del nuevo usuario");
        u1.setDomicilio(leer.next());
        
        System.out.println("Ingrese el telefono del nuevo usuario");
        u1.setTelefono(leer.next());
        
        return u1;
    } 
    
    public void edad (Usuario u) {
        Date hoy = new Date();
        int nacimiento = hoy.getYear() - u.getNacimiento().getYear();
        System.out.println("el usuario tiene: "+ nacimiento+" años");
    }
    
}
