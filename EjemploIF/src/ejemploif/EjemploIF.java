/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjemploIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
       
        Scanner lector= new Scanner(System.in);
        
        //nombre="octavio";
        System.out.println("ingrese su nombre");
        nombre= lector.next();
        
        System.out.println("ingrese su edad");
        edad= lector.nextInt();
        
        System.out.println("usted "+nombre +" tiene "+edad+" años de edad");
        /*
        if(edad>17)
        {
            System.out.println("es mayor de edad");
            
        }
        if(edad<18)
        {
            System.out.println("es menor");
        }*/
        
        if(edad>17)
        {
            System.out.println("es mayor de edad");
        }
        else
        {
            System.out.println("es menor");
        }
    }
   
}
