
package ejemplo2;


public class Precio {
    private double euros;

    public double obtener() {
        return euros;
    }

    public double agregar(double x) {
        euros = x;
        return 0;
    }
}
