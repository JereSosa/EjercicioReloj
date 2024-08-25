
package tplabogithubreloj;

public class TpLaboGitHubReloj {

    
    public static void main(String[] args) {
        Reloj reloj = new Reloj("lunes","00:51","Rolex", 123332);
        reloj.limpiarPantalla();
        reloj.incrementarDia();
        reloj.incrementarHora();
        reloj.limpiarPantalla();
    }
    
}
