/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infonumerica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class InfoNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se brinda la informacion sobre un número ingresado.
        // modulo %
        
        Scanner miTeclado= new Scanner(System.in);
        String Aux;
        /*Integer NumeroUno;
        
        Integer NumeroDos;
        Integer Resultado;
        NumeroUno=2;
        NumeroDos=10;
        */
        /*
        Resultado= 2%10;
        System.out.println("el resultado de 2%10 es: "+Resultado);
        Resultado= 11%3;
        System.out.println("el resultado de 10%2 es: "+Resultado);
        */
        Integer NumeroIngresado;
        System.out.println("Ingrese Un número");
        Aux= miTeclado.next();
        NumeroIngresado= Integer.parseInt(Aux);
        
        /*
            1- informar si el mayor o menor a 100
            2- informar si es positivo o negativo.
            3- informar si es PAR
        */
        /*
            if(NumeroIngresado>0)
            {
                System.out.println("positivo");
            }
        else
            {
                if(NumeroIngresado<0)
                {
                     System.out.println("negativo");
                }
            }
        */
        
        if(NumeroIngresado!=100)
        {
            if(NumeroIngresado>0)
            {
                System.out.println("positivo");
            }else
            {
                System.out.println("negativo");
            }
        }
        
       
        
        
        
        
        
        
        
        
        
        
    }
    
}
