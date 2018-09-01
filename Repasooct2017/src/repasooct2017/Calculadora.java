/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasooct2017;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    
    public int PrimerNumero;
    public int SegundoNumero;
    
    Calculadora(){
        
        this.PrimerNumero=10;
        this.SegundoNumero=10;
    }
    
        /**
     * de instancia o de objeto
     */
    public int Sumar(){
        int suma= this.PrimerNumero+this.SegundoNumero;        
        return suma;
    }
    public float dividir(){
        float resultado=0;
        
//        if(this.SegundoNumero ==0)
//        {       
//        }
//        else
//        {
//            resultado= (float)this.PrimerNumero/(float) this.SegundoNumero;
//        }
        
        if(this.SePuedeDividrir())
        {
            resultado= (float)this.PrimerNumero/(float) this.SegundoNumero;   
        }
        
        return resultado;
    }
    
    /**
     * Retorna True si el segundo numero es distinto de cero
     * @return 
     */
    private boolean SePuedeDividrir(){
        boolean retorno= false;
        if(this.SegundoNumero!=0)
        {
            retorno= true;
        }
        return retorno;
    }
    
    /**
     * suma dos numeros enteros
     * @param numeroUno
     * el primer numero
     * @param numeroDos
     * el segundo numero
     */
    public static void Sumar(int numeroUno,int numeroDos)
    {
        int suma= numeroUno+numeroDos;
        System.out.println("la suma es "+suma);
    }
    

}
