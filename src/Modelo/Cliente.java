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
public class Cliente extends Persona {
    
    private ArrayList<Vehiculo> vehiculos;
    

    public Cliente() {
    }
    
    public Cliente(Vehiculo vehiculo, String nombre_1, String nombre_2, String apellido, long identificacion, String telefono, String direccion) {
        super(nombre_1, nombre_2, apellido, identificacion, telefono, direccion);
        this.vehiculos = new ArrayList<>();
        this.vehiculos.add(vehiculo);
        
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public String listar_personas(ArrayList<Cliente> clientes) {
        String cadena = "";
        String tipo = "";
        for (int i = 0; i < clientes.size(); i++) {
            
            if(clientes.get(i).getVehiculos().get(0) instanceof Motocicleta){
                tipo = "Moto";
            }
            if(clientes.get(i).getVehiculos().get(0) instanceof Autobus){
                tipo = "Bus";
            }
            if(clientes.get(i).getVehiculos().get(0) instanceof Automovil){
                tipo = "Carro";
            }
            
            cadena = cadena + clientes.get(i).getIdentificacion() + "  |  " + clientes.get(i).getNombre_1() + " " + clientes.get(i).getNombre_2() + " |  " + clientes.get(i).getApellido() + "  |  " + clientes.get(i).getDireccion() + "  |  " + clientes.get(i).getTelefono() + "  |  " + tipo + " " + clientes.get(i).getVehiculos().get(0).getPlaca() + "\n";
            
            
        }
        System.out.println(cadena);
        return cadena;
    }

   
    
    public String infor_persona(Cliente cliente){
        
        String cadena = "";
        String vehiculo = "";
        String tipo = "";
        
        for (int i = 0; i < cliente.getVehiculos().size(); i++) {
            if(cliente.getVehiculos().get(i) instanceof Automovil){
                tipo = "Automovil";
            }else{
                if(cliente.getVehiculos().get(i) instanceof Motocicleta){
                    tipo = "Moticicleta";
                }else{
                    tipo = "Autobus";
                }
            }
            vehiculo = "Tipo Vehiculo: " + tipo +
                    "\nMarca: "+ cliente.getVehiculos().get(i).getMarca()+
                    "\nModelo: " + cliente.getVehiculos().get(i).getModelo() + 
                    "\nPlaca: " + cliente.getVehiculos().get(i).getPlaca();
        }
        
        cadena = "Nombre: " + cliente.getNombre_1() + " " + cliente.getNombre_2() +
                "\nApellido: " + cliente.getApellido() +
                "\nIdentificacion: " + cliente.getIdentificacion() +
                "\nVehiculo(s): " + vehiculo +
                "\nTelefono: " + cliente.getDireccion() + 
                "\nDireccion: " + cliente.getDireccion();
        
        return cadena;
        
    }
    
  
}
