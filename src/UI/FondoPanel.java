package UI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Un panel personalizado que pinta una imagen de fondo.
 */
public class FondoPanel extends JPanel {
    private Image imagen;

    public FondoPanel() {
        try {
            // Buscamos la imagen en el paquete resources
            this.imagen = new ImageIcon(getClass().getResource("/resources/IES.png")).getImage();
        } catch (Exception e) {
            System.err.println("Error de carga: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
       // 1. IMPORTANTE: Esto limpia el rastro de la imagen anterior al redimensionar
       super.paintComponent(g); 

       if (imagen != null) {
           // 2. Dibujamos la imagen usando el ancho (getWidth) y alto (getHeight) actual del panel
           // Esto hace que la imagen se estire "elásticamente" con la ventana
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
       }
    }
}