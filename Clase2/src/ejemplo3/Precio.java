
package ejemplo3;


public class Precio {

    private double euros;

    public double obtener() {
        return euros;
    }

    public double agregar(double x) {
        euros = x;
        return 0;
    }

    public Precio() {
        agregar(30.2);
    }
    
    public Precio (double y){
        agregar(y);
    }
            
}
