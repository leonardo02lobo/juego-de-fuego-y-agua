package Juego;

import Tableros.Tablero_Nivel_1;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Personaje {

    public static boolean band = false;
    public static int xfuego = 70;
    public static int yfuego = 630;
    public static int xagua = 70;
    public static int yagua = 530;
    private final int movimiento = 10;
    int[][] tablero = Tablero_Nivel_1.nivel1;
    Timer tiempo;

    public Personaje() {
        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablero[yagua / 25 + 2][xagua / 40] != 1) {
                    yagua += movimiento;
                }
                if (tablero[yfuego / 25 + 2][xfuego / 40] != 1) {
                    yfuego += movimiento;
                }
            }
        });
        tiempo.start();
    }

    public void paint(Graphics g) {

        ImageIcon fuego = new ImageIcon(getClass().getResource("../images/nino-fuego.png"));
        g.drawImage(fuego.getImage(), xfuego, yfuego, null);

        ImageIcon agua = new ImageIcon(getClass().getResource("../images/nina-agua.png"));
        g.drawImage(agua.getImage(), xagua, yagua, null);
    }

    public void movimientoAgua(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            if (tablero[yagua / 25 - 1][xagua / 40] != 1) {
                yagua -= movimiento;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            if (tablero[yagua / 25 + 2][xagua / 40] != 1) {
                yagua += movimiento;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            if (tablero[yagua / 25][xagua / 40 - 1] != 1) {
                xagua -= movimiento;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            if (tablero[yagua / 25][xagua / 40 + 1] != 1) {
                xagua += movimiento;
            }
        }

        //detectar colision para los diamantes
        colisionDiamantes();
        colisionObstaculos();
    }

    public void colisionDiamantes() {
        for (int i = 0; i < Diamantes.xdiamanteRojo.length; i++) {
            if (Diamantes.xdiamanteRojo[i] == xfuego && Diamantes.ydiamanteRojo[i] == yfuego) {
                Diamantes.xdiamanteRojo[i] = 0;
                Diamantes.ydiamanteRojo[i] = 0;
            } else if (Diamantes.xdiamanteAzul[i] == xagua && Diamantes.ydiamanteAzul[i] == yagua) {
                Diamantes.xdiamanteAzul[i] = 0;
                Diamantes.ydiamanteAzul[i] = 0;
            }
        }
    }

    public void movimientoFuego(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (tablero[yfuego / 25 - 1][xfuego / 40] != 1) {
                yfuego -= movimiento;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (tablero[yfuego / 25 + 2][xfuego / 40] != 1) {
                yfuego += movimiento;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (tablero[yfuego / 25][xfuego / 40 - 1] != 1) {
                xfuego -= movimiento;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (tablero[yfuego / 25][xfuego / 40 + 1] != 1) {
                xfuego += movimiento;
            }
        }
        //detectar colision para los diamantes
        colisionDiamantes();
        colisionObstaculos();
    }

    public void colisionObstaculos() {
        if (tablero[yagua / 25 + 2][xagua / 40] == 2) {
            tiempo.stop();        
            band = true;
        }else if (tablero[yfuego / 25 + 2][xfuego / 40] == 3) {
            tiempo.stop();        
            band = true;
        }else if (tablero[yagua / 25 + 2][xagua / 40] == 4 || tablero[yfuego / 25 + 2][xfuego / 40] == 4) {
            tiempo.stop();        
            band = true;
        }
    }
}
