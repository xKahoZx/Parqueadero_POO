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
public class Servicio_hora extends Servicio{
    
    private int hora_entrada;
    private int minuto_entrada;
    private int hora_salida;
    private int minuto_salida;

    public Servicio_hora() {      
    }

    public Servicio_hora(int hora_entrada, int minuto_entrada, Vehiculo vehiculo, Cupo cupo) {
        super(vehiculo, cupo);
        this.hora_entrada = hora_entrada;
        this.minuto_entrada = minuto_entrada;
        this.hora_salida = 0;
        this.minuto_salida = 0;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public int getMinuto_entrada() {
        return minuto_entrada;
    }

    public void setMinuto_entrada(int minuto_entrada) {
        this.minuto_entrada = minuto_entrada;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getMinuto_salida() {
        return minuto_salida;
    }

    public void setMinuto_salida(int minuto_salida) {
        this.minuto_salida = minuto_salida;
    }
    
    
}
