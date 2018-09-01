/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miTeclado= new Scanner(System.in);
        String mesDelAño;
        String Vacaciones;
        int edad=87;
        //
      
        System.out.println("Vas de vacaciones");
        Vacaciones= miTeclado.next();
        if(Vacaciones.equals("si"))
        {
            System.out.println("ingrese mes del año");
            mesDelAño= miTeclado.next();
            switch(mesDelAño)
            {
                case "enero" :
                case "febrero" :
                    System.out.println("Lindo veranito!!!");
                    break;
                case "julio" :
                    System.out.println("Lindo invierno!!!");
                    if(edad>80)
                    {
                        System.out.println("vacunate contra la gripe");
                    }
                    break;
                default: 
                     System.out.println("no es verano!!!");
                    break;
            }
        }
       
        
    }
    
}
