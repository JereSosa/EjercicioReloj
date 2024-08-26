/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplabogithubreloj;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    private Reloj reloj;
    
    public Persona(String nombre, int edad, Reloj reloj) {
        this.nombre = nombre;
        this.edad = edad;
        this.reloj = reloj;
    }

    public Reloj getReloj() {
        return reloj;
    }
    
    public void usarReloj(){
        if(reloj instanceof RelojFit){
            RelojFit relojFit = (RelojFit) reloj;
            relojFit.cuentaPasos(10, 20); 
            relojFit.frecuenciaAleatoria(); 
        } else {
            System.out.println("El reloj no tiene la funcion fit");
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", reloj=" + reloj + '}';
    }
    
}
