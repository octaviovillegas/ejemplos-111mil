/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarrayv2;

/**
 *
 * @author Usuario
 */
public class EjemploArrayv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] alumno={"maria","manuel","diego","estela","martin"};
         int[] notas={10,2,5,2,7};
         
        
        
    }
    
    public static int RetornarCantidadDeAprobados(int[] miparametro)
    {
        int resultado=0;
        for (int i = 0; i < miparametro.length; i++) {
            if(miparametro[i]>3)
                resultado++;
        }
        
        return resultado;
        
    }
     public static int RetornarPromedio(int[] miparametro)
     {
         return 10;
     }
     
     public static String RetornarElNombreDeLaMejorNota(int[] notas,String[] nombres)
     {
         String  retorno="";
         
         return retorno;
     }
             
             
             
    
}
