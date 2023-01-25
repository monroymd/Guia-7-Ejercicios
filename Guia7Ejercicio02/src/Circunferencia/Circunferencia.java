
package Circunferencia;


public class Circunferencia {
    private int radio;
    
    
    public Circunferencia(){
        
    }
    public Circunferencia( int radio){
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }

    

    
    
    

    
    
    
    
    
}
