package cine;

import java.util.Scanner;

public class Persona {
    private String nombrePersona;
    private String apellidoPresona;
    private String idPersona;

    public String getApellidoPresona() {
        return apellidoPresona;
    }

    public String getIdPersona() {
        return idPersona;
    }
    
    public Persona(){
            this.nombrePersona="";
            this.apellidoPresona="";
            this.idPersona="";
    }
    
    public void setNombrePersona(String datoNombre){
        this.nombrePersona=datoNombre;        
    }
    public String getNombrePersona(){
        return this.nombrePersona;
    }
     public void setApellidoPresona(String apellidoPresona) {
        this.apellidoPresona = apellidoPresona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }
    public void imprimirDatos(){
        System.out.println("Nombre cliente: " + this.getNombrePersona());
        System.out.println("Apellido cliente: " + this.getApellidoPresona());
        System.out.println("Cedula cliente: " + this.getIdPersona());
    }
    
}
