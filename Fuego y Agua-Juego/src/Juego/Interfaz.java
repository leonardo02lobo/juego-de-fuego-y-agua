package Juego;

import Principal.Main;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interfaz extends JPanel {

    public static boolean CambioPersonaje = true;
    Personaje personaje = new Personaje();
    Escenario escenario = new Escenario();
    Diamantes diamantes = new Diamantes();

    public Interfaz() {
        
        
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.movimientoFuego(e);
                personaje.movimientoAgua(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setFocusable(true);
        
    }

    @Override
    public void paint(Graphics g) {
        escenario.paint(g);
        personaje.paint(g);
        diamantes.paint(g);
        setOpaque(false);
        super.paint(g);
    }
}
