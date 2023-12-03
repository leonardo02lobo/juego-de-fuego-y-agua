package Juego;

import Principal.Main;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana extends JFrame {

    public Ventana() {
        Interfaz game = new Interfaz();
        super.setTitle("Fuego & Agua-java");
        super.add(game);
        super.setSize(1200, 750);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
