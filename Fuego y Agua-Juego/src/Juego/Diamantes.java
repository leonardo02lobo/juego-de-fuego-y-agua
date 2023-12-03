package Juego;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Diamantes {

    public static int xdiamanteRojo[] = {370, 170, 290};
    public static int ydiamanteRojo[] = {630, 300, 50};
    public static int xdiamanteAzul[] = {480,480,90,490};
    public static int ydiamanteAzul[] = {630,320,130,100};

    public void paint(Graphics g) {
        for (int i = 0; i < xdiamanteRojo.length; i++) {
            ImageIcon diamanteRojo = new ImageIcon(getClass().getResource("../images/diamante-rojo.png"));
            g.drawImage(diamanteRojo.getImage(), xdiamanteRojo[i], ydiamanteRojo[i], null);
        }
            for (int i = 0; i < xdiamanteAzul.length; i++) {
            ImageIcon diamanteAzul = new ImageIcon(getClass().getResource("../images/diamante-azul.png"));
            g.drawImage(diamanteAzul.getImage(), xdiamanteAzul[i], ydiamanteAzul[i], null);
        }
    }
}
