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
public class Servicio_contrato  extends Servicio{
    
    private Date fecha_inicio;
    private Date fecha_fin;

    public Servicio_contrato(Date fecha_inicio, Date fecha_fin, Vehiculo vehiculo, Cupo cupo) {
        super(vehiculo, cupo);
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Servicio_contrato() {
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
    
    
}
