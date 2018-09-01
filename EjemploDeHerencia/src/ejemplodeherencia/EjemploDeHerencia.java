/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeherencia;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class EjemploDeHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FacturaA mifactura= new FacturaA(66);
        // mifactura.setterNumero(66);
        mifactura.MostrarNumero(); 
      
       ArrayList<Persona> listadoPersonas; 
       listadoPersonas= new ArrayList<Persona>();
       
        AlumnoEgresado unAluEg= new AlumnoEgresado();
       listadoPersonas.add(unAluEg);
       
       Alumno Unalumno = new Alumno();
       listadoPersonas.add(Unalumno);
       
       Persona unaPersona = new Persona();       
       listadoPersonas.add(unaPersona);
       
        for (int i = 0; i < listadoPersonas.size(); i++) {
             listadoPersonas.get(i).MostrarLosDatos();
        }
        for (Persona alguno : listadoPersonas) {
            alguno.MostrarLosDatos();
        }
        
        
        Iterator<Persona> iterador=listadoPersonas.iterator();
        while( iterador.hasNext())
        {
          Persona nueva= iterador.next();
          nueva.MostrarLosDatos();
        }
        
        
       
       // no anda por ahora , falta el to....
       System.out.println("listado"+ listadoPersonas);
       
       
       
       
       
       // de string
       ArrayList<String> ListadoPalabras;
       ListadoPalabras= new ArrayList<String>();
       
       ListadoPalabras.add("primera");
       ListadoPalabras.add("segunda");
       ListadoPalabras.add("tercera");
       
       System.out.println("listado"+ ListadoPalabras);
        
        
        
        
        
        
        
    }
    
}
