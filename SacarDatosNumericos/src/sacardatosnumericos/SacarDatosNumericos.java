/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacardatosnumericos;

/**
 *
 * @author Usuario
 */
public class SacarDatosNumericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SacarDatosNumericos.mostrarCaracteresAschii();
    }
    
    public static void mostrarCaracteresAschii()
    {
            for (int Contador = 0; Contador <150; Contador++) {
             System.out.println( Contador +" = "+(char)Contador); 
            }
          
             
    }
    //a
    //ab
    //abc
    public static void PatronDeLetras()
    {
//        char letra;
//        
//        for (letra='A'; letra < 'a'; letra++) {
//            
//            System.out.println(letra);
//            
//        }
//        System.out.println((char)65);
//        
        
        for (int Contador = 0; Contador <150; Contador++) {
             System.out.print( Contador +" = "+(char)Contador);  
          
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             for (int i = 65; i <= Contador; i++) {
                             
            }            
            System.out.println();
            
            //1
                    //1b
                    //1bc
                    //1bcd
                    //1bcd2
                    
                    
                    
            
        }
        
        
    }
    
    
    public static void MostrarTablaDeMultiplicar()
    {
        
        int numeroIngresado=6;
        int resultado=0;
        for (int i = 1; i < 11; i++) {
            resultado= numeroIngresado*i;
            System.out.println(numeroIngresado+" X "+ i +" = "+ resultado );
        }
        
    }
    
    
    public static void ejercicio58SerieUTNFRA()
    {       
        /*
        Mostrar la serie “UTN-FRA” , 
        para los múltiplos de 3 = “FRA” 
        , para los múltiplos de 5 = “UTN” y
        para los múltiplos de 3 y 5 al mismo tiempo mostrar “UTN-FRA”.
        */
        //int bandera=0;
        for (int numero = 0; numero < 100; numero++) {
            
            if(numero%3==0 && numero%5==0 )
            {
                System.out.println("UTN-FRA");
               // bandera=1;
            }else
            {
                 if(numero%3==0 )
                 {
                     System.out.println("FRA");
                      // bandera=1;
                 }else
                 {
                      if(numero%5==0 )
                        {
                            System.out.println("UTN");
                              //bandera=1;
                        }
                      else{
                          System.out.println(numero);
                      }
                 }
                
            }
            
            //if(numero %5!=0 && numero%3!=0  )
           /* if(bandera==0)
            {
                System.out.println(numero);
            }
             bandera=0;
            */
            
        }//for
        
    }
    
    
    public static void HacerPiramide()
    {
        int CantidadDeFilas=7;
        for (int contador = 1; contador < CantidadDeFilas; contador++) {
            
            for (int ContadorLugares = CantidadDeFilas-1; ContadorLugares > contador; ContadorLugares--) {
                System.out.print(" ");
            }
            
            for (int ContadorDos = 1; ContadorDos <=(2*contador-1); ContadorDos++) {
                System.out.print("X");
            }
            System.out.println("");
        }
    
    }
    /**
     * 153 =1 ^ 3 + 5  ^ 3+ 3 ^ 3= 153
     */
    public static void NUmeroArmstrong()
    {
        int NumeroIngresado=153;
        
        int numero=NumeroIngresado;
        if(numero<0)
        {
           numero= numero*-1;     
        }        
        int CantidadDigitos=0;
        while(numero>0)
        {
            numero= numero/10;
            CantidadDigitos++;
            
        }
        System.out.println(CantidadDigitos);
        
        int digito;
        int suma=0;
        int AuxNumero=NumeroIngresado;
        while(AuxNumero>0)
        {
            digito= AuxNumero%10;
            suma=suma+(int) Math.pow(digito,CantidadDigitos);
            AuxNumero= AuxNumero/10;
            System.out.println(digito);           
        }        
        System.out.println(suma);
        if(suma==NumeroIngresado)
        {
            System.out.println("es armstrong");
        }
        else {
            System.out.println("no es....");
        }


        
        
        
        
    }
    
    /**
     * Recorrer los numeros del 1 al 100.
     * Mostrar en lugar del numero la palabra "UTN" 
     * para todos los  multiplos de 3(tres)
     * Mostrar en lugar del numero la palabra "FRA" 
     * para todos los multiplos de 5(cinco)
     * Mostrar la palabra "UTNFRA" 
     * para todos los multiplos de 3 y 5 (ej: 15)     
     */
    public static void SerieUtnFra()
    {
        
    }
    public static void serieFibonacci()
    {
        int fibonacci;
        int actual=1;
        int anterior=0;
        for (int contador = 0; contador < 5; contador++) {
            
            fibonacci= anterior+actual;         
            anterior= actual;
            actual=fibonacci;
            System.out.println("es el : "+ fibonacci);
        }
    }
    public static void RetornarMayor(){
        
        int numUno=0;
        int numDos=0;
        int numTres=0;
        if(numUno> numDos && numUno>numTres)
        {
            System.out.println("el mayor es :"+numUno);
        }else
        {
            if(numDos> numUno && numDos>numTres)
            {
                System.out.println("el mayor es :"+numDos);
  
            }
            else
            {
                System.out.println("el mayor es :"+numTres);
  
            }
        }
    }
    
}
