package cine;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner objTeclado = new Scanner(System.in);
        Persona objPersona = new Persona();
        
        System.out.println("Digite el nombre");
        String datoNombre = objTeclado.nextLine();
        objPersona.setNombrePersona(datoNombre);
        
        System.out.println("Digite el apellido");
        String datoApellido = objTeclado.nextLine();
        objPersona.setApellidoPresona(datoApellido);
        
        System.out.println("Digite la cedula");
        String datoCedula = objTeclado.nextLine();
        objPersona.setIdPersona(datoCedula);
        
        objPersona.imprimirDatos();
        
        Sala objSala = new Sala();
        System.out.println("Digite codigo sala");
        String datoSala = objTeclado.nextLine();
        objSala.setIdSala(datoSala);
        
        System.out.println("Digite tipo sala");
        String datoTipo = objTeclado.nextLine();
        objSala.setIdSala(datoTipo);
        
        objSala.imprimirDatos();
        
        
        
        
    }
}
