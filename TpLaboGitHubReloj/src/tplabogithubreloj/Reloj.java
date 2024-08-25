/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplabogithubreloj;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author jeso_
 */
public class Reloj {
    public String dia;
    public LocalTime hora;
    public String modelo;
    public long numSerie;

    public Reloj(String dia, String hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    
    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora.format(DateTimeFormatter.ofPattern("HH:mm"));
    }


    
    public void incrementarDia(){
        switch (dia.toLowerCase()) {
            case("lunes"):
                dia = "Martes";
                break;
            case("martes"):
                dia ="Miercoles";
                break;
            case("miercoles"):
                dia = "Jueves";
                break;
            case("jueves"):
                dia ="Viernes";
                break;
            case("viernes"):
                dia ="Sabado";
                break;
            case("sabado"):
                dia = "Domingo";
                break;
            case("domingo"):
                dia ="Lunes";
                break;     
                
        }
    }
    
    public void incrementarHora() {
        Scanner leer = new Scanner(System.in);
        System.out.println("desea incrementar minutos o horas? M/H");
        String opcion = leer.next();

        while (!opcion.equalsIgnoreCase("m") && !opcion.equalsIgnoreCase("h")) {
            System.out.println("ingreso un carácter invalido, vuelva a ingresar: M/H");
            opcion = leer.next();
        }

        if (opcion.equalsIgnoreCase("m")) {
            System.out.println("cuantos minutos desea agregar?");
            int minutos = leer.nextInt();
            hora = hora.plusMinutes(minutos);
        } else if (opcion.equalsIgnoreCase("h")) {
            System.out.println("cuantas horas desea agregar?");
            int horas = leer.nextInt();
            hora = hora.plusHours(horas);
        }

        System.out.println("Nueva hora: " + getHora());
    }
    
    public void limpiarPantalla(){
        System.out.println("hoy es: " + dia);
        System.out.println("Y la hora es: " + hora);
    }
}
