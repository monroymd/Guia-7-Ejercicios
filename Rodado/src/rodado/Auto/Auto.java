
package rodado.Auto;


public class Auto {
    private String marca;
    private String modelo;
    private String año;
    private String dominio;
    private String cilindrada;
    private String puertas;
    private String color; 

    public Auto() {
    }

    public Auto(String marca, String modelo, String año, String dominio, String cilindrada, String puertas, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.dominio = dominio;
        this.cilindrada = cilindrada;
        this.puertas = puertas;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", dominio=" + dominio + ", cilindrada=" + cilindrada + ", puertas=" + puertas + ", color=" + color + '}';
    }
    
    
    
}
