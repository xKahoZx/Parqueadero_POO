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
public class Operador extends Persona{
    
    private double salario;
    private boolean estado;
    private Cuenta cuenta;
    
    public Operador(){
        
    }

    public Operador(double salario,String password, boolean estado, String nombre_1, String nombre_2, String apellido, long identificacion, String telefono, String direccion) {
        super(nombre_1, nombre_2, apellido, identificacion, telefono, direccion);
        this.salario = salario;
        this.estado = estado;
        Cuenta cuenta_aux = new Cuenta(identificacion, password);
        this.cuenta = cuenta_aux;
    }

    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    
    public String listar_personas(ArrayList<Operador> operadores) {
        String cadena = "";
        for (int i = 0; i < operadores.size(); i++) {
            
            cadena = cadena + operadores.get(i).getIdentificacion() + "  |  " + operadores.get(i).getNombre_1() + " " + operadores.get(i).getNombre_2() + "   |    " + operadores.get(i).getApellido() + "    |    " + operadores.get(i).getDireccion() + "    |    " + operadores.get(i).getTelefono() + "    |    " + operadores.get(i).getSalario() + "\n";
            
            
        }
        System.out.println(cadena);
        return cadena;
    }
    
    
    
    
}
