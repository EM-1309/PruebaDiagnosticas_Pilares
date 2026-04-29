/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

public class EstiloUI {

    // Colores corporativos
    public static final Color ROJO_IES = new Color(204, 0, 0);
    public static final Color ROJO_HOVER = new Color(255, 51, 51); // Un rojo más vibrante
    public static final Color BLANCO_PURO = Color.WHITE;
    public static final Color GRIS_BORDE = new Color(220, 220, 220);

    /**
     * Aplica estilo y efectos interactivos al botón
     * @param boton
     */
    public static void estiloBotonPrincipal(JButton boton) {
        // Estilo base
        boton.setBackground(ROJO_IES);
        boton.setForeground(BLANCO_PURO);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        boton.setFocusPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

        // Efecto Hover (Interactividad)
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setBackground(ROJO_HOVER);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setBackground(ROJO_IES);
            }
        });
    }

    /**
     * Aplica el estilo al panel contenedor central
     * @param panel
     */
    public static void estiloPanelContenedor(JPanel panel) {
        panel.setOpaque(true);
        panel.setBackground(BLANCO_PURO);
        panel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(GRIS_BORDE, 1),
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));
    }
}