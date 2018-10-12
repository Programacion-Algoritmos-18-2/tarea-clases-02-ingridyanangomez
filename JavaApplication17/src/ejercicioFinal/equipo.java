
package ejercicioFinal;


public class equipo {

    public String nombre;
    public String ciudad;
    public int num_jugadores;

    //contructor por defecto
    public equipo() {
    }

    //constructor con 1 parametro
    public equipo(String nombre) {
        this.nombre = nombre;
    }

    //constructor con 2 parametros
    public equipo(String nombre, int num_jugadores) {
        this.nombre = nombre;
        this.num_jugadores = num_jugadores;
    }

    //constructor con 3 parametros
    public equipo(String nombre, int num_jugadores, String ciudad) {
        this.nombre = nombre;
        this.num_jugadores = num_jugadores;
        this.ciudad = ciudad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNum_jugadores() {
        return num_jugadores;
    }

    public void setNum_jugadores(int num_jugadores) {
        this.num_jugadores = num_jugadores;
    }
}
    

