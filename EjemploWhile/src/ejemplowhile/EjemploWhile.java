/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //EjemploWhile.IteracionSinCantidad();
       // EjemploWhile.PromedioConIf();
       
       //( EjemploWhile.PromedioConWhile();
        
    }//finaliza el main
    
    /**
     * Pide dos numeros e informa el promedio
     */
    public static void PromedioConIf()
    {
        Scanner miTeclado= new Scanner(System.in);
        Integer NumeroUno;
        Integer NumeroDos;
        Integer Promedio;
        String aux;
        
        System.out.println("Ingrese numero #1:");
        aux= miTeclado.next();
        NumeroUno= Integer.parseInt(aux);
        
        System.out.println("Ingrese numero #2:");
        aux= miTeclado.next();
        NumeroDos= Integer.parseInt(aux);
        
        Promedio= (NumeroUno+NumeroDos)/2;
        System.out.println("El promedio es: "+Promedio);
        
        
    }//finaliza promedio con if
    
    
     /**
     * Pide dos numeros e informa el promedio
     */
    public static void PromedioConWhile()
    {
        Scanner miTeclado= new Scanner(System.in);
        Integer Numero;       
        Integer Promedio;
        Integer Contador=0;
        Integer Suma=0;
        String aux;
        
        while(Contador<3)
        {
            Contador++;
            System.out.println("Ingrese numero #"+Contador);
            aux= miTeclado.next();
            Numero= Integer.parseInt(aux);
            Suma=Suma+Numero;  
            
        }
        Promedio=Suma/Contador;
        System.out.println("El promedio es: "+Promedio);
    
    }
    
    
    /**
     * Cuando no sabemos la cantidad de iteraciones 
     */
    public static void IteracionSinCantidad()
    {
        
        String Continuar="si";
        while(!Continuar.equals("no"))
            {
                System.out.println("Hola, desea continuar");
                Scanner miTeclado= new Scanner(System.in);
                Continuar= miTeclado.next();
                    
            }
        
    }
    
    public static void SalidaPorLogica()
    {       
       String Continuar="si";
        while(true)
        {
            System.out.println("Hola, desea continuar");
            Scanner miTeclado= new Scanner(System.in);
            Continuar= miTeclado.next();
            if(Continuar.equals("no"))
            {
                break;
            }                   
        }
    }
    
    public static void PedirNumeros()
    {
        Integer numero;
        Integer contador=0;
        String aux;
        Integer suma=0;
        Scanner miTeclado = new Scanner(System.in);
        while(contador<10 && suma<50)
        {
            contador++;
            System.out.println("Ingrese numero "+ contador+":");
            aux= miTeclado.next();
            numero=Integer.parseInt(aux);
            suma= suma+numero;
           /* if(suma>50){break;
            }*/
        }       
        System.out.println("la suma es "+suma);
        System.out.println("la cantidad es "+contador);
    }
    
    public static void MostrarMenu()
    {
        String opcion="nada";
        Scanner miTeclado= new Scanner(System.in);       
        while(!opcion.equals("6"))
        {            
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("6-salir");
            System.out.println("Ingrese opcion deseada");
            opcion= miTeclado.next();  
            switch(opcion)
            {
                case "1":
                    EjemploWhile.Sumar();
                    break;
                case "2":
                    EjemploWhile.Restar();
                    break;
                case "6":
                    System.out.println("Adios!!!");
                    break;
                default:
                    System.out.println("ingreso una opcion equivocada");
            
            }  
            
        } //del while 
        
        System.out.println("Cerro el menu");
        
    }
    
    
    public static void Sumar()
    {
        Integer numeroUno;
        Integer numeroDos;
        Scanner miTeclado= new Scanner(System.in);
        String aux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer número");
        aux= miTeclado.next();
        numeroUno  = Integer.parseInt(aux);
         //Segundo numero
        System.out.println("Ingrese segundo número");
        aux= miTeclado.next();
        numeroDos  = Integer.parseInt(aux);
        
        resultado=numeroUno+numeroDos;
        System.out.println("El resultado de la suma es "+resultado);
        
    }
     public static void Restar()
    {
        Integer numeroUno;
        Integer numeroDos;
        Scanner miTeclado= new Scanner(System.in);
        String aux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer número");
        aux= miTeclado.next();
        numeroUno  = Integer.parseInt(aux);
         //Segundo numero
        System.out.println("Ingrese segundo número");
        aux= miTeclado.next();
        numeroDos  = Integer.parseInt(aux);
        
        resultado=numeroUno-numeroDos;
        System.out.println("El resultado de la resta es "+resultado);
        
    }
    
}
