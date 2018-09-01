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
public class Repasooct2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora.Sumar(12, 23);
        
        int numero;
        String palabra;
        Calculadora MiCalculadora;
        MiCalculadora = new Calculadora();
        MiCalculadora.PrimerNumero=33;
        MiCalculadora.SegundoNumero=0;
        int resultado;
        resultado=MiCalculadora.Sumar();
        System.out.println("resultado "+resultado);
        float ResultadoFloat= MiCalculadora.dividir();
        System.out.println("resultado float "+ResultadoFloat);
        
       
        
        
    }
    
}
