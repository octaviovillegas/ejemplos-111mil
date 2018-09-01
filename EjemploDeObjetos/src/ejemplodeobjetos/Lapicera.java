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
public class Lapicera {
    
    private int rojo=100;
    private int azul=100;
    
    public void ecribir(String color,int cantidad)
    {
        if (color.equalsIgnoreCase("rojo"))
        {
            if(cantidad< this.rojo)
            {
                this.rojo= this.rojo - cantidad;
            }else
            {
                System.out.println("no hay rojo ");
            }
        }
        if (color.equalsIgnoreCase("azul"))
        {
            if(cantidad< this.azul)
            {
                this.azul= this.azul - cantidad;
            }else
            {
                System.out.println("no hay azul ");
            }
        }
    }
    public void cargar(String color,int cantidad)
    {
        if(color.equalsIgnoreCase("rojo"))
        {
            this.rojo= this.rojo + cantidad;
        }
         if(color.equalsIgnoreCase("azul"))
        {
            this.azul= this.azul + cantidad;
        }
    }

}