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
        
    }
    public class RelojFit extends Reloj {
    
    public RelojFit(String dia, String hora, String modelo, long numSerie) {
        super(dia, hora, modelo, numSerie);
    }

    public void cuentaPasos(int x, int y) {
        // Implementación para contar pasos
        System.out.println("Pasos contados en coordenadas (" + x + ", " + y + ")");
    }

    public void frecuenciaAleatoria() {
        // Generar y mostrar una frecuencia aleatoria
        double frecuencia = Math.random() * 100;
        System.out.println("Frecuencia aleatoria: " + frecuencia);
    }
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
}

}

}
