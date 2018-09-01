/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasodearray;

/**
 *
 * @author Usuario
 */
public class RepasoDeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // RepasoDeArray.CrearArray();
        int[] listadoNumerosMain;
        //listadoNumerosMain= RepasoDeArray.RetornarArray();
        //listadoNumerosMain= RepasoDeArray.RetornarArrayDeRandom();
        listadoNumerosMain= RepasoDeArray.RetornarArrayDeRandomConCantidad(10);
        RepasoDeArray.MostrarARRAY(listadoNumerosMain);
        int cantidadA= RepasoDeArray.RetornarCantidadDeAprobados(listadoNumerosMain);
        int cantidadb= RepasoDeArray.RetornarCantidadDeNoAprobados(listadoNumerosMain);
               
        //        int retornorandom= RepasoDeArray.RetornarRandom();
        //        retornorandom= RepasoDeArray.RetornarRandom();
        //        retornorandom= RepasoDeArray.RetornarRandom();
        //        retornorandom= RepasoDeArray.RetornarRandom();
        int[] notasUBA=RepasoDeArray.RetornarArrayDeRandomConCantidad(3);
        int[] notasUTN=RepasoDeArray.RetornarArrayDeRandomConCantidad(3);
        String devolucion;
        devolucion=RepasoDeArray.RetornarQuienTieneMejorPromedio(notasUBA, notasUTN);
        
    }
    
    public static String[] RetornarNombresRandom()
    {
        String[] datos= new String[10];
        String[] nombres={"rogelio","alfredo","julieta","miguel","jose","maria","tina","cristina","elton","jorge "};
        String[] apellidos={"agua","mercurio","roberto","zorro","perez","sosa","giratoria","aguilera","jhon","miguel "};
        for (int i = 0; i < datos.length; i++) {
            datos[i]=nombres[i]+" " +apellidos[i];
            
        }
        return datos;
    }
    
    
    public static int RetornarMejorNota(int[] arrayparametro)
    {
        int notaRetorno=0;
        for (int i = 0; i < arrayparametro.length; i++) {
            if(i==0)
            {
                notaRetorno= arrayparametro[i];
            }else
            {
                if (notaRetorno< arrayparametro[i])
                {
                    notaRetorno= arrayparametro[i];
                }
            }
        }
        
        return notaRetorno;
    }
    public static int RetornarPeorNota(int[] arrayparametro)
    {
        int notaRetorno=0;
        for (int i = 0; i < arrayparametro.length; i++) {
            if(i==0)
            {
                notaRetorno= arrayparametro[i];
            }else
            {
                if (notaRetorno> arrayparametro[i])
                {
                    notaRetorno= arrayparametro[i];
                }
            }
        }
        
        return notaRetorno;
        
    }   
    public static int[] retornarMejoresNotasArray(int[] uno , int[] dos)
    {
        int[] retorno= new int[uno.length];
        for (int i = 0; i < uno.length; i++) {
            
            if(uno[i]>dos[i])
            {
                retorno[i]=uno[i];
            }else
            {
                retorno[i]=dos[i];
            }
                
        }
       
                
                
        return retorno;
    }   
    /**
     * Los parametros son dos arrays de enteros 
     * @return 
     * retorna "El primero tiene mejor promedio" 
     * o 
     * "El segundo tiene el mejor promedio",
     * segun quien tenga el mejor promedio 
     * de los dos arrays de notas 
     */
    public static String RetornarQuienTieneMejorPromedio(int[] primerArray, int[]segundoArray)
    {
        String retorno="";
        float PrimerPromedio;
        float SegundoPromedio;
        
        PrimerPromedio= RepasoDeArray.RetornarPromedio(primerArray);
        SegundoPromedio= RepasoDeArray.RetornarPromedio(segundoArray);
        if(PrimerPromedio>SegundoPromedio)
        {
            retorno="El primero tiene mejor promedio";
            
        }else
        {
            retorno="El segundo tiene mejor promedio";

        }
        
        
        return retorno;
    }    
    public static float RetornarPromedio(int[] notas)
    {
        float promedio=0;
        int suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma= suma + notas[i];
        }
        promedio= (float)suma/ (float)notas.length;
        return promedio;
    }    
     public static int RetornarCantidadDeNoAprobados(int[] listadoDeNotas)
    {
        int retorno=0;       
        for (int i = 0; i < listadoDeNotas.length; i++) {
            if(listadoDeNotas[i]<4)
                retorno++;
        }       
        return retorno;
    }
    public static int RetornarCantidadDeAprobados(int[] listadoDeNotas)
    {
        int retorno=0;       
        for (int i = 0; i < listadoDeNotas.length; i++) {
            if(listadoDeNotas[i]>3)
                retorno++;
        }       
        return retorno;
    }  
    public static int[] RetornarArrayDeRandomConCantidad( int cantidad)
    {
        int[] arrayRetorno= new int[cantidad];
         for (int i = 0; i < arrayRetorno.length; i++) {            
           arrayRetorno[i]= RepasoDeArray.RetornarRandom();
        }             
        return arrayRetorno;
    }
    public static void MostrarARRAY(int[]  parametroArray)
    {
        for (int i = 0; i < parametroArray.length; i++) {
            System.out.println("numero:"+ parametroArray[i] );
        }
        
        
    }
    public static int[] RetornarArrayDeRandom()
    {
        int[] retorno = new int[10];
        for (int i = 0; i < retorno.length; i++) {      
          
           retorno[i]= RepasoDeArray.RetornarRandom();
        }        
        return retorno;
        
    }    
    public static int RetornarRandom()
    {
        int numeroRandom=0;
        double randomAux=Math.random();
        randomAux= randomAux*10;        
        numeroRandom=(int) randomAux;       
        return numeroRandom;
    }
    public static int[] RetornarArray()
    {       
        int[] arraynuevo={2,3,5};
        return arraynuevo;
    }
    public static void CrearArray()
    {
        int[] arrayDeNumeros;
        arrayDeNumeros = new int[3];
        arrayDeNumeros[0]=55;
        arrayDeNumeros[2]=33;
        arrayDeNumeros[1]=-22;
       // da error  arrayDeNumeros[3]=99;
        int[] arrayDeNumerosBis =new  int[3];
        
        int[] arraynuevo={2,3,5};
        
    }
}
