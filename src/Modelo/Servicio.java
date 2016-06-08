/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Fernando
 */
public class Servicio {
    
    private double costo;
    private Vehiculo vehiculo;
    private Cupo cupo;
    private boolean estado;

    public Servicio() {
    }

    public Servicio(Vehiculo vehiculo, Cupo cupo) {
        this.costo = 0;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
        this.estado = true;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cupo getCupo() {
        return cupo;
    }

    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }
    
    public Servicio buscar_servicio(Parqueadero parqueadero, String placa){
        
        for (int i = 0; i < parqueadero.getRegistro().size(); i++) {
            if(parqueadero.getRegistro().get(i).getVehiculo().getPlaca().equals(placa) && parqueadero.getRegistro().get(i).isEstado()){
                return parqueadero.getRegistro().get(i);
            }
        }
        return null;
    }
    
}
