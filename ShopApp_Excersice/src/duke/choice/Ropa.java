
package duke.choice;

/**
 *
 * @author Jaime
 */
public class Ropa {
    
    private String descripcion;
    
    private double precio;
    
    private String talla = "M";
    
    private final double MIN_PRECIO = 10;
    
    private final double MIN_TAX = 0.2;
    String setDescripcion;
    double setPrecio;
    String setTalla;
    

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio*(1+MIN_TAX);
    }

    public String getTalla() {
        return talla;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = (precio>10)? precio: MIN_PRECIO; 
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
         
   
    
}
