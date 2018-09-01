/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication8 {

    public static void mostrarPares()
    {   
        Integer contador=0;
        while(contador<100)
        {
            
            
            
            contador++;
            if(contador%2==0)
            {
                System.out.println("es par:" +contador);
            }
        }
        
    
    
    
    }
    
    public static void SacarCantidadDemayores()
    {
        /*
         pedir 5 edades e informar cuantos mayores a 18 hay
        */
        Integer contador=0;
        String aux;
        Integer edad;
        Integer CantidadDeMayores=0;
        Scanner miTeclado=new Scanner(System.in);
        while (contador<5)
        {
            contador ++;
            System.out.println("Ingrese edad");
            aux= miTeclado.next();
            edad= Integer.parseInt(aux);
            if(edad>17)
            {
                CantidadDeMayores++;
            }
            
        }
        
        
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner miteclado= new Scanner(System.in);
        
        String Respuesta;
        Integer contador=0;
        System.out.println("hay alguien para la edad???");
        Respuesta = miteclado.next();
        while(Respuesta.equals("si"))
        {
            // tomo los datos
            
            contador++;
            
           
            System.out.println("hay alguien mas para la edad???");
            Respuesta = miteclado.next();
          
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Integer Contador=0;
        Integer sumador=0;
        Integer cantidad;
        Integer promedio=0;
        cantidad=10;
        
        
        while(Contador<cantidad)
        {
             Contador++;
            System.out.println("numero: "+ Contador);
          
            sumador= sumador+Contador;
              
        }
        
        promedio=sumador/cantidad;
        
        
        
        
        
        
        
        
        
        
        
      Integer contador=0;
      String aux;
      Integer Edad;
      Integer Sumador=0;
      Integer promedio;
      Scanner miTeclado = new Scanner(System.in);
        
      while(contador<3)
      {
          
          System.out.println("Ingrese su Edad perona numero: "+contador);
          aux= miTeclado.next();
          Edad = Integer.parseInt(aux);
          Sumador= Sumador+Edad;
         
          contador= contador+1;
      }
        promedio= Sumador/3; 
        System.out.println("el promedio es: "+promedio);
        
        
    }
    
}
