/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadodeobjetos2018;

/**
 *
 * @author usuario
 */
public class Producto {
    private double precio;
    private String nombre;
    
    public Producto()
    {
        this.nombre="nada";
        this.precio=-1;
    }
    public Producto(String nombre)
    {
        this();
        this.nombre=nombre;
        //this.precio=-1;
    }
    public Producto(String nombre, double precio)
    {
        this(nombre);
        this.precio=precio;
        
    }
    public Producto( double precio,String nombre)
    {
        this(nombre,precio);       
    }
    
    public void SetNombre(String nombre)
    {
        this.nombre=nombre;
    } 
    public void SetPrecio(Double precio)
    {
        this.precio=precio;
    }
    public double GetPrecio()
    {
        return this.precio;
    }
    public String GetNombre()
    {
        return this.nombre;
    } 
    public void mostrar()
    {
        System.out.println("nombre:"+this.nombre+"precio:"+this.precio);
    }
    
    
}
