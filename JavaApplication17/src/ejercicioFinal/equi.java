/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioFinal;

public class equi {
    public static void main(String[]args){
        equipo e;
        
        e = new equipo();
        e.setNombre("Liga de Loja");
        e.setCiudad("Loja");
        e.setNum_jugadores(35);
        
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s \n",e.getNombre(),e.getNum_jugadores(),e.getCiudad());
        
        equipo e2;
        e2 = new equipo("Barcelona sc");
        e2.setCiudad("Guayaquil");
        e2.setNum_jugadores(22);
        
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", e2.getNombre(),e2.getNum_jugadores(),e2.getCiudad());
        
        equipo e3 = new equipo("emelec",28);
        e3.setCiudad("machala");
        
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", e3.getNombre(),e3.getNum_jugadores(),e3.getCiudad());
        
      
    }
    
}
