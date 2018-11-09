/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadodeobjetos2018;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author usuario
 */
public class ListadoDeObjetos2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bebidas algo;
        algo=new Bebidas();
        
        algo.mostrar();
        
        
        
        
        
        List<Producto> listadoDeProductosOBJ;
        listadoDeProductosOBJ=  new ArrayList<>();
        
        
        Producto unProd= new Producto();
        listadoDeProductosOBJ.add(unProd);
        listadoDeProductosOBJ.add(new Producto());
       listadoDeProductosOBJ.forEach((productoAux)->{
            System.out.println("el nombre es: "+productoAux.GetNombre());                
           });
        
       
    }
    
}
