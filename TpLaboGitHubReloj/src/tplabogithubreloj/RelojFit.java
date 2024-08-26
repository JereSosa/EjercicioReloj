/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplabogithubreloj;

/**
 *
 * @author Usuario
 */
public class RelojFit extends Reloj {
    public RelojFit(String dia, String hora, String modelo, long numSerie) {
        super(dia, hora, modelo, numSerie);
    }

    public void cuentaPasos(int x, int y) {
        // Implementación para contar pasos
        System.out.println("Pasos contados en coordenadas (" + (int) (Math.random() * 50)+ ", " +(int) (Math.random() * 50) + ")");
    }

    public void frecuenciaAleatoria() {
        // Generar y mostrar una frecuencia aleatoria
        double frecuencia = (double) (Math.random() * 100);
        System.out.println("Frecuencia aleatoria: " + frecuencia);
    }
}
