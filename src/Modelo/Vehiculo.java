/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Vehiculo {
    
    private String placa;
    private String modelo;
    private String marca;
    
    public Vehiculo(){
        
    }

    public Vehiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public Vehiculo buscar_vehiculo(String placa, ArrayList<Cliente> clientes ){
        ArrayList<Vehiculo> vehiculo = new ArrayList<>();
        for (int i = 0; i < clientes.size(); i++) {
            vehiculo = clientes.get(i).getVehiculos();
            for (int j = 0; j < vehiculo.size(); j++) {
                if(vehiculo.get(j).getPlaca().equals(placa)){
                    return vehiculo.get(j);
                }
            }
            
            
        }
        return null;
    }
    
}
