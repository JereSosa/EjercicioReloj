/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tplabogithubreloj;

/**
 *
 * @author jeso_
 */
public class TpLaboGitHubReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj rolex = new RelojFit("Lunes", "08:30", "Cassio", 2451473);
        Persona jere = new Persona("Jeremias", 27, rolex);
        
        System.out.println(jere.getReloj().getDia());
        System.out.println(jere.getReloj().getHora());
        jere.getReloj().incrementarDia();
        jere.getReloj().incrementarHora();
        jere.getReloj().limpiarPantalla();
        jere.usarReloj();
    }
}


