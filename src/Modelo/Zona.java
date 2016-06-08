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
public class Zona {
    
    private String nombre;
    private String tipo;
    private ArrayList<Cupo> cupos;

    public Zona(){
        
    }
    
    public Zona(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cupos = new ArrayList<>();
        this.cupos = cupos;
    }
    //para agregar todos los cupos uso un metodo en la interfaz
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Cupo> getCupos() {
        return cupos;
    }

    public void setCupos(Cupo cupo) {
        this.cupos.add(cupo);
    }
    
    public String listar_zona(ArrayList<Zona> zonas){
        
        String cadena = "";
        
        for (int i = 0; i < zonas.size(); i++) {
            int cupo_disponible = cupo_disponible(zonas.get(i).getCupos());
            cadena = cadena + zonas.get(i).getNombre() + "   |   " + zonas.get(i).getTipo() + "   |   " + zonas.get(i).getCupos().size() + "  |  " + cupo_disponible + "\n";
                   
        }
        
        return cadena;
        
    }
    
    public int cupo_disponible(ArrayList<Cupo> cupos){
        
        int cont = 0;
        for (int i = 0; i < cupos.size(); i++) {
            if(cupos.get(i).isEstado()){
                cont ++;
            }
        }
        return cont;
    }
    
    public Cupo buscar_cupo_disponible(ArrayList<Zona> zonas, String tipo){
        ArrayList<Cupo> cupos = new ArrayList<>();
        for (int i = 0; i < zonas.size(); i++) {
            if(zonas.get(i).getTipo().equals(tipo)){
                cupos = zonas.get(i).getCupos();
                for (int j = 0; j < cupos.size(); j++) {
                    if(cupos.get(i).isEstado()){
                        cupos.get(i).setEstado(false);
                        return cupos.get(i);
                    }
                }
            }
                       
        }
        
        return null;
    }
    
    public Parqueadero cambiar_estado_cupo(Parqueadero parqueadero, Cupo cupo){
        for (int i = 0; i < parqueadero.getZonas().size(); i++) {
            if(parqueadero.getZonas().get(i).getNombre().equals(cupo.getZona().getNombre())){
                parqueadero.getZonas().get(i).getCupos().set(i, cupo);
            }
        }
        
        return parqueadero;
    }
    
    public Zona buscar_zona(Parqueadero parqueadero, String nombre){
        
        Zona zona = new Zona();
        for (int i = 0; i < parqueadero.getZonas().size(); i++) {
            if(parqueadero.getZonas().get(i).getNombre().equals(nombre)){
                zona = parqueadero.getZonas().get(i);
                return zona;
            }
        }
        return null;
    }
    
    public Parqueadero editar_zona(Parqueadero parqueadero, Zona zona, String nombre){
        
        for (int i = 0; i < parqueadero.getZonas().size(); i++) {
            if(parqueadero.getZonas().get(i).getNombre().equals(nombre)){
                parqueadero.getZonas().set(i, zona);
                
            }
        }
        return parqueadero;
        
    }
    
    public Zona registrar_cupo(Zona zona, int numero){
        
        int cupos_aux = zona.getCupos().size();
        for (int i = 0; i < numero + 1; i++) {
            if(i <= cupos_aux){
                
            }else{
                Cupo cupo = new Cupo(i, zona, true);
                zona.setCupos(cupo);
            }
            
        }
        
        return zona;
    }
    
}
