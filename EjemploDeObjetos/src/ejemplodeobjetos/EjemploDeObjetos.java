/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeobjetos;

/**
 *
 * @author Usuario
 */
public class EjemploDeObjetos {

    /**
     * necesito una lapicera con dos colores. rojo y azul
     * cada uno tiene una cantidad de 100.
     * El método escribir recibe el color 
     * y la cantidad de tinta .ej:escribir("rojo",100)
     * a utilizar de no tener cantidad suficiente 
     * se muestra un mensaje.
     * El método Cargar tinta recibe el color 
     * y la cantidad pra cargar ej:cargar("rojo",180)
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logi c here
        
        Lapicera algunaLapicera= new Lapicera();
        algunaLapicera.ecribir("rojo",120);
        algunaLapicera.cargar("azul",50);
        algunaLapicera.ecribir("rojo",90);
                
    }
    
}
