/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

/**
 *
 * @author Usuario
 */
public class FuncionesParaFor {
    
    public static void MostrarPalindromo()
    {
        int NumeroReverso;
        int numero=2367;
        String numeroEnLetras="";
        String NumeroActual="";
        // proceso....
        
       
        numeroEnLetras=NumeroActual+numeroEnLetras;
        NumeroReverso=7632;
        if(numero==NumeroReverso)
        {
            System.out.println("Es palindromo");
        }else
        {
            System.out.println("no es");
        }
        
    }
    
    
    
    
    public static  void saludar()
    {
        System.out.println("Hola mundo.");
    }
    
    public static void MostrarNumeroCreciente()
    {
        int contador;
        for (contador= 0; contador < 100; contador++) {
            System.out.println("el numero es : " + contador);
            
        }
    }
    public static void MostrarNumerosDecreciente()
    {
        for (int contador = 100; contador > 0; contador--) {
            System.out.println("el numero es :"+contador);
        }
    }
        
    
    public static void MostrarNumerosPares()
    {
     
        
    }
     public static void MostrarNumerosdivisiblesPorSei()
    {
     
        
  

    }
     public static void MostrarTablaDeMultiplicar()
     {
         int numero=9;
         int resultado;
         
         
         
         for (int contador = 1; contador < 11; contador++) {
             resultado= numero*contador;
             //System.out.println("resultado"+resultado   );
             System.out.println(numero+" * "+contador+" = "+resultado);
         }
                 
     }
     public static void SaberSiEsPrimo()
     {         
         int numero = 7;
         int contador;
         boolean bandera=true;         
         for (contador = 2; contador < numero; contador++) {
             
             if(numero%contador==0)
             {
                 bandera=false;
                break; 
             }
         }
         if(bandera==false)
         {
              System.out.println("no es primo");
         }else
         {
               System.out.println("Es un Número Primo");
         }
         
         
         
         
         
         
         
         
         
         //
        /* if(contador==numero)
         {
             System.out.println("Es un Número Primo");
         }else
         {
             System.out.println("no es primo");
         }
         */
         //esperando..
         
         
         
         
     }
     public static void CentroNumerico(){
         
         int numero=0;
         int sumaAnteriores=0;
         int sumaPosteriores=0;
         boolean   EsCentroNumerico=false;
         
         
        // for ( numero = 0; numero < 1000; numero++) {
         while( numero < 1000) {    
             
             sumaAnteriores=0;
             sumaPosteriores=0;
              EsCentroNumerico=false;
               for (int contador = 1; contador < numero; contador++)
               {
                    sumaAnteriores= sumaAnteriores+contador; 
                 }
               // System.out.println(sumaAnteriores);

                 for (int posterior = numero+1 ; ; posterior++) {

                     sumaPosteriores= sumaPosteriores+posterior;
                     if(sumaAnteriores==sumaPosteriores )
                     {
                         EsCentroNumerico=true;
                         break;
                     }             
                     if(sumaPosteriores> sumaAnteriores)
                     {
                         break;             
                     }
                 }
                 if(EsCentroNumerico)
                 {
                     System.out.println("es centro numerico"+ numero);         
                 }else
                 {
                     System.out.println("No es.");
                 }


         }
         
         numero++;
        
         
     }
             
     public static void FibonacciSucesion()
     {
         
         int actual=1;
         int anterior=0;
         int NuevoFibonacci=0;
         
         for (int contador = 1; contador < 10; contador++) {         
             
             NuevoFibonacci=actual+anterior;             
             anterior= actual;
             actual=NuevoFibonacci;         
             
             System.out.println( "serie"+NuevoFibonacci);
         }
     }

}



