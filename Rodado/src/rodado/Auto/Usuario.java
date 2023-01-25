
package rodado.Auto;

import java.util.Date;


public class Usuario {
    
    private String nombre;
    private String apellido;
    private String dni;
    private Date nacimiento; 
    private String domicilio;
    private String telefono; 
    
    //SimpleDateFormat = new SimpleDateFormat (dd/MM/YYYY);
    
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni, Date nacimiento, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
