/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriesnumerosespeciales;

/**
 *
 * @author Usuario
 */
public class Series {
    
    public static void MostrarDel1al100(){
        
        for (int numero = 1; numero < 101; numero++) {
            
            System.out.println(" el numero es "+numero);
        }
        
    }
    
    public static void MostrarParesDel1al100(){
        
        for (int numero = 1; numero < 101; numero++) {
            
            if(Numeros.Espar(numero)==true)
            {
                System.out.println(" el numero es "+numero);
            }
            
        }
        
    }
   
    
    /**
     * mostrar los numeros del 1 al 100
     * si el numero es multiplo de 3 , reemplazamos al numero por UTN
     * si el numero es multiplo de 5 , reemplazamos al numero por FRA
     * si el numero es multiplo de 3 y 5 , reemplazamos al numero por UTN-FRA
     */
    public static void MostrarSerieUTNFRA()
    {
         for (int numero = 1; numero < 101; numero++) {
            if(numero%3==0)
            {
                System.out.println("UTN");
            }else
            {
                 System.out.println(numero);
            }
           
        }
    }
    
    public static void MostrarNumerosPrimosEntreRangos(int min, int max)
    {
         for (int numero = min; numero < max; numero++) {
            
            if(Numeros.EsPrimo(numero)==true)
            {
                System.out.println("  es primo"+numero);
            }
             
        }
    }
     public static void MostrarLosPrimosDel1al100(){
        
      Series.MostrarNumerosPrimosEntreRangos(1, 100);
        
    }
    
}
