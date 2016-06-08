/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Fernando
 */
public class Factura {
    
    private long id;
    private Servicio servicio;
    private Date fecha_generacion;
    
    public Factura(){
        
    }

    public Factura(long id, Servicio servicio, Date fecha_generacion) {
        this.id = id;
        this.servicio = servicio;
        this.fecha_generacion = fecha_generacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Date getFecha_generacion() {
        return fecha_generacion;
    }

    public void setFecha_generacion(Date fecha_generacion) {
        this.fecha_generacion = fecha_generacion;
    }
    
    
    
}
