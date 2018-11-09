/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodelistado;

/**
 *
 * @author usuario
 */
public class producto {
    private double precio;
    private String nombre;
    public producto()
    {
        this.nombre="nadie";
        this.precio=1000;
    }
    public void mostrar()
    {
        System.out.println("nombre: "+this.nombre+"precio:"+this.precio);
    }
    
}
