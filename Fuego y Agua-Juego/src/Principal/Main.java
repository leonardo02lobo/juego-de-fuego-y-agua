package Principal;

import Juego.Diamantes;
import Juego.Interfaz;
import Juego.Personaje;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        Interfaz game = new Interfaz();
        ventana.setTitle("Fuego & Agua-java");
        ventana.add(game);
        ventana.setSize(1200, 750);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        while (true) {
            if (Personaje.band) {
                int reinciaJuego = JOptionPane.showConfirmDialog(null, "Haz perdido, "
                        + "¿Quieres reiniciar el Jugeo?", "Perdiste!!!", JOptionPane.YES_OPTION);
                if (reinciaJuego == 0) {
                    reiniciaValores();
                } else if (reinciaJuego == 1) {
                    System.exit(0);
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            game.repaint();
        }
    }
    
    public static void reiniciaValores() {

        Personaje.band = false;
        Personaje.xagua = 70;
        Personaje.xfuego = 70;
        Personaje.yagua = 530;
        Personaje.yfuego = 630;
        Diamantes.xdiamanteRojo[0] = 370;
        Diamantes.xdiamanteRojo[1] = 170;
        Diamantes.xdiamanteRojo[2] = 290;
        Diamantes.ydiamanteRojo[0] = 630;
        Diamantes.ydiamanteRojo[1] = 300;
        Diamantes.ydiamanteRojo[2] = 50;
        Diamantes.xdiamanteAzul[0] = 480;
        Diamantes.xdiamanteAzul[1] = 480;
        Diamantes.xdiamanteAzul[2] = 90;
        Diamantes.xdiamanteAzul[3] = 490;
        Diamantes.ydiamanteAzul[0] = 630;
        Diamantes.ydiamanteAzul[1] = 320;
        Diamantes.ydiamanteAzul[2] = 130;
        Diamantes.ydiamanteAzul[3] = 100;
    }
}
