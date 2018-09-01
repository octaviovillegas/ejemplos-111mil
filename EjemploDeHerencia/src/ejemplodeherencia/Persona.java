/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeherencia;

/**
 *
 * @author Usuario
 */
public class Persona {
       private String _nombre;
       private String _apellido;
    public void MostrarLosDatos()
    {
        System.out.println("nombre: "+ this._nombre);
        System.out.println("apellido: "+this._apellido);
        
    }
}
