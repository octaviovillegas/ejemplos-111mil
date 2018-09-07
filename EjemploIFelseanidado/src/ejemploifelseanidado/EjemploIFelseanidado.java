/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploifelseanidado;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjemploIFelseanidado {

    /**
     * necesito  saber si es 
     * niño(1,12) , 
     * adolescente(13-17) o 
     * adulto(18 en adelante)
     * se ingresa una edad y luego se informa en que 
     * franja de edad se encuentra
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner lector= new Scanner(System.in);
        edad = lector.nextInt();
        /*
        if(edad<13)
        {
            System.out.println("es niño");
        }
        
        if(edad>17)
        {
            System.out.println("es adulto");
        }
        
        if(edad>12 && edad <18)
        {
            System.out.println("es adolescente");
        } 
        */
        /*esto esta OK
        if(edad<13)
        {
            System.out.println("es niño");
        }else
        {
            if(edad>17)
            {
                System.out.println("es adulto");
            }else
            {
                System.out.println("es adolescente");
            }       
        }
        */
        
        ///esto esta mal
        
        if(edad<13)
        {
            System.out.println("es niño");
        }
        if(edad>17)
        {
            System.out.println("es adulto");
        }else
        {
            System.out.println("es adolescente");
        }       

      
       
        
       
        
        
        
        
        
        
        
    }
    
}
