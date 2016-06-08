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
public class Parqueadero {
    
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Operador> operadores;
    private ArrayList<Zona> zonas;
    private ArrayList<Servicio> registro;
    
    public Parqueadero(){
        
    }

    public Parqueadero(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.operadores = new ArrayList<>();
        this.zonas = new ArrayList<>();
        this.registro = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public ArrayList<Operador> getOperadores() {
        return operadores;
    }

    public void setOperadores(Operador operador) {
        this.operadores.add(operador);
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(Zona zona) {
        this.zonas.add(zona);
    }

    public ArrayList<Servicio> getRegistro() {
        return registro;
    }

    public void setRegistro(Servicio servicio) {
        this.registro.add(servicio);
    }
    
    
    public void crear_operador(double salario,String password, boolean estado, String nombre_1, String nombre_2, String apellido, long identificacion, String telefono, String direccion){
        Operador operador_aux = new Operador(salario, password, estado, nombre_1, nombre_2, apellido,identificacion, telefono, direccion);
        setOperadores(operador_aux);
        
        
    }
    
    public boolean autenticar_operador(String password, long username){
        
        for (int i = 0; i < getOperadores().size(); i++) {
            
            if(getOperadores().get(i).getCuenta().getUsername()==username){
                
                if(getOperadores().get(i).getCuenta().getPassword().equals(password)){
                    return true;
                }
            }
        }
        
        return false;
        
    }

    public void registrar_cliente(String tipo, String  placa, String modelo, String marca, String nombre_1, String nombre_2, String apellido, long identificacion, String telefono, String direccion){
        
        if(tipo.equals("Motocicleta")){
            Motocicleta obj_vehiculo = new Motocicleta(placa, modelo, marca);
            Cliente cliente = new Cliente(obj_vehiculo, nombre_1, nombre_2, apellido, identificacion, telefono, direccion);
            setClientes(cliente);
        }else{
            if(tipo.equals("Automovil")){
                Automovil obj_vehiculo = new Automovil(placa, modelo, marca);
                Cliente cliente = new Cliente(obj_vehiculo, nombre_1, nombre_2, apellido, identificacion, telefono, direccion);
                setClientes(cliente);
            }else{
                Autobus obj_vehiculo = new Autobus(placa, modelo, marca);
                Cliente cliente = new Cliente(obj_vehiculo, nombre_1, nombre_2, apellido, identificacion, telefono, direccion);
                setClientes(cliente);
            }
        }
    }
    
    public void Registrar_zona(String nombre, String tipo, int numero_cupos){
        Zona nueva_zona = new Zona(nombre, tipo);
        
        nueva_zona.registrar_cupo(nueva_zona, numero_cupos);
        
        setZonas(nueva_zona);
        
        System.out.println(getZonas().get(0).getCupos().size());
        
    }
    
    public Cliente buscar_persona(String identificacion){
        Cliente cliente = new Cliente();
        for (int i = 0; i < clientes.size(); i++) {
            if(getClientes().get(i).equals(identificacion)){
                cliente = getClientes().get(i);
            }
        }
        System.out.println(cliente.getNombre_1());
        return cliente;
    }
    
    public Parqueadero modificar_servicio(Servicio servicio, Parqueadero parqueadero, int hora, int minuto, double costo){
        Zona zona = new Zona();
        
        for (int i = 0; i < parqueadero.getRegistro().size(); i++) {
            
            if(parqueadero.getRegistro().get(i).getVehiculo().getPlaca().equals(servicio.getVehiculo().getPlaca())  && parqueadero.getRegistro().get(i).isEstado()){
                servicio.setEstado(false);
                if(servicio instanceof Servicio_contrato){
                    Servicio_contrato servicio_contrato = (Servicio_contrato) servicio;
                }else{
                    Servicio_hora servicio_hora = (Servicio_hora) servicio;
                    servicio_hora.setCosto(costo);
                    servicio_hora.setMinuto_salida(minuto);
                    servicio_hora.setHora_salida(hora);
                    parqueadero = zona.cambiar_estado_cupo(parqueadero, servicio_hora.getCupo());
                    parqueadero.getRegistro().set(i, servicio_hora);
                }
                
                return parqueadero;
            }
            
        }
        return null;
        
    }
    
    public Servicio buscar_Servicio(String placa){
        
        for (int i = 0; i < this.getRegistro().size(); i++) {
            if(this.getRegistro().get(i).getVehiculo().getPlaca().equals(placa) && this.getRegistro().get(i).isEstado()){
                if(this.getRegistro().get(i) instanceof Servicio_hora){
                    Servicio_hora servicio = (Servicio_hora) this.getRegistro().get(i);
                    return servicio;
                }else{
                    Servicio_contrato servicio = (Servicio_contrato) this.getRegistro().get(i);
                    return servicio;
                }
            }
        }
        
        return null;
    }
    
    
     public Cliente buscar_cliente(long pIdentificacion){
        Cliente cliente = new Cliente();
        long ObjIdentificacion;
        
        for (int i = 0; i < clientes.size(); i++) {
            ObjIdentificacion = this.clientes.get(i).getIdentificacion();
            if(ObjIdentificacion == pIdentificacion){
                cliente = getClientes().get(i);
            }
        }
        System.out.println(cliente.getNombre_1());
        return cliente;
    }
    
    
}
