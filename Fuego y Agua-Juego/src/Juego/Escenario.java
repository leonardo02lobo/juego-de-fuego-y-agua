package Juego;

import Tableros.Tablero_Nivel_1;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Escenario {

    private final int ancho = 40;
    private final int alto = 25;

    public void paint(Graphics g) {
        int[][] tablero1 = Tablero_Nivel_1.nivel1;

        for (int i = 0; i < tablero1.length; i++) {
            for (int j = 0; j < tablero1[i].length; j++) {
                switch (tablero1[i][j]) {
                    case 1:
                        {
                            ImageIcon piedra = new ImageIcon(getClass().getResource("../images/piedra.jpg"));
                            g.drawImage(piedra.getImage(), j * ancho, i * alto, null);
                            break;
                        }
                    case 2:
                        ImageIcon fuego = new ImageIcon(getClass().getResource("../images/fuego.jpg"));
                        g.drawImage(fuego.getImage(), j * ancho, i * alto, null);
                        break;
                    case 3:
                        ImageIcon agua = new ImageIcon(getClass().getResource("../images/agua.jpg"));
                        g.drawImage(agua.getImage(), j * ancho, i * alto, null);
                        break;
                    case 4:
                        ImageIcon veneno = new ImageIcon(getClass().getResource("../images/veneno.jpg"));
                        g.drawImage(veneno.getImage(), j * ancho, i * alto, null);
                        break;
                    default:
                        {
                            ImageIcon piedra = new ImageIcon(getClass().getResource("../images/fondo.jpg"));
                            g.drawImage(piedra.getImage(), j * ancho, i * alto, null);
                            break;
                        }
                }
            }
        }
    }

}
