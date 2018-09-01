/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeherencia;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class AlumnoEgresado extends Alumno{
    private Date _fechaEgreso;
    private float _promedio;
    
    public void MostrarLosDatos()
    {
        super.MostrarLosDatos();
        System.out.println("fe:"+this._fechaEgreso);
        System.out.println(this._promedio+ "p: ");
        
        
    }
}
