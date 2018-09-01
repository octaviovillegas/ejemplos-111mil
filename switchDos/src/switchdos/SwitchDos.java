/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchdos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SwitchDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miEscaner= new Scanner(System.in);
        Integer  numeroIngresado ;
        Integer Diferencia;
        String datoAux;
        //leemos la variable .next()
        //parseamos
        Integer  numeroSecreto =3;//(int) (Math.random()*10 )+1;
        //System.out.println(" numero secreto "+numeroSecreto);
        System.out.println("Ingrese el número");
        datoAux= miEscaner.next();
        numeroIngresado= Integer.parseInt(datoAux);
        
        if(numeroIngresado==numeroSecreto)
        {
            System.out.println("ganó");
        }
        else
        {
            if(numeroIngresado>numeroSecreto)
            {
                System.out.println("te pasaste");
            }else
            {
                 System.out.println("falto");
            }
            Diferencia= numeroIngresado-numeroSecreto;
           // Diferencia= Math.abs(Diferencia);
            //System.out.println(Diferencia);
            switch(Diferencia)
            {
                case -1:
                case 1:
                    System.out.println("...");
                    break;
            }
            
        } // del else  if(numeroIngresado==numeroSecreto)
      
        
        
        
        
        
        
    }
    
}
