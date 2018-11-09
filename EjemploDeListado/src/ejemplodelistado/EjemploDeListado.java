/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodelistado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjemploDeListado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> listadoDeNombres = new ArrayList<String>();
        listadoDeNombres.add("Juan");
        listadoDeNombres.add("Pedro");
        listadoDeNombres.add("José");
        listadoDeNombres.add("María");
        listadoDeNombres.add("Sofía");
        System.out.println("tamanio:" +listadoDeNombres.size());
        String datoString=  listadoDeNombres.get(0);
        for(String nombre :listadoDeNombres )
        {
            System.out.println("nombre:" +nombre);
        }
        
        Scanner lector= new Scanner(System.in);
        String NombreIngresado;
        
        
        
        NombreIngresado= lector.next();
        while(listadoDeNombres.contains(NombreIngresado))
        {
            System.out.println("ya existe");
             NombreIngresado= lector.next();
            
        }
        listadoDeNombres.add(NombreIngresado);
        
        
        
        
        
        System.out.println("listo para borrar   ...");
         NombreIngresado= lector.next();
        while(listadoDeNombres.contains(NombreIngresado)==false)
        {
            System.out.println("no se puede borrar algo que no existe");
            NombreIngresado= lector.next();
            
        }
        listadoDeNombres.remove(NombreIngresado);
        
        
        //listadoDeNombres.forEach((nombreaux)->{});
        listadoDeNombres.forEach((nombreaux)->{
            System.out.println("el nombre es: "+nombreaux);                
           });
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<producto> listadoProductos= new ArrayList<>();  

        producto unProd= new producto();
        listadoProductos.add(unProd);
        listadoProductos.add(new producto());

        listadoDeNombres.get(0);


    
    }
    
}
