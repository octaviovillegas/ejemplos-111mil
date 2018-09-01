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
public class Numeros {
    
    public static boolean  Espar(int numero)
    {          
        if(numero%2==0)
            return true;         
        return false;
    }
     public static boolean  EsPrimo(int numero)
    {          
        int contadorDeDivisores =0;     
        
        for (int contador = numero-1; contador > 1; contador--) {
            
            if(numero%contador==0)
            {
                contadorDeDivisores++;
                break;
            }
                
        }
        if(contadorDeDivisores==0)
            return true;
        return false;
    }
    
     
    
}
