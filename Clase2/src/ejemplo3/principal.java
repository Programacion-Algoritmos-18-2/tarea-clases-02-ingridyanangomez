
package ejemplo3;


public class principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Precio p;
        p = new Precio();
        Precio n = new Precio(25.9);
        
        System.out.println(p.obtener());
        System.out.println(n.obtener());

    }

    
}
