/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionwhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class IteracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String Marca;
       Integer Cantidad;
       String AuxCantidad;
       Integer Precio=35;
       Integer PrecioBruto;
       Double PrecioFinal= (double)0;
       
       Scanner  miEscaner= new Scanner(System.in);
       
       System.out.println("ingrese marca: ");
       Marca= miEscaner.next();
       
       System.out.println("Ingrese cantidad: ");
       AuxCantidad= miEscaner.next();
       Cantidad= Integer.parseInt(AuxCantidad);
       
       PrecioBruto= Cantidad*Precio;
       
       if(Cantidad>5)
       {
           PrecioFinal= PrecioBruto*0.5;       
       }else
       {
           // todos los menores a 6
           if(Cantidad==5)
           {
               if(Marca.equals("ArgentinaLuz"))
               {
                    PrecioFinal= PrecioBruto*0.6; 
               }
               else
               {
                    PrecioFinal= PrecioBruto*0.7; 
               }
               
           }else
           {
               // todos los menores a 5
               if(Cantidad==4)
               {
                   if(Marca.equals("ArgentinaLuz")  Marca.equals("ArgentinaLuz"))
                   {
                       PrecioFinal= PrecioBruto*0.75; 
                   }else
                   {
                            PrecioFinal= PrecioBruto*0.8; 
                    }
                   
               }else
               {
                   
               
               }
           
           }
       }
       
       
       
       
       
       
       
       
       
       
       
       System.out.println("debe pagar "+ PrecioFinal);
      
    }
    
}
