package UI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class EstiloUI {

    // Colores corporativos
    public static final Color ROJO_IES = new Color(204, 0, 0);
    public static final Color ROJO_HOVER = new Color(255, 51, 51);
    public static final Color BLANCO_PURO = Color.WHITE;
    public static final Color GRIS_BORDE = new Color(220, 220, 220);
    public static final Color GRIS_TEXTO = new Color(80, 80, 80);
    public static final Color AZUL_ENLACE = new Color(0, 102, 204);

    /**
     * Aplica estilo y efectos interactivos al botón
     */
    public static void estiloBotonPrincipal(JButton boton) {
        boton.setBackground(ROJO_IES);
        boton.setForeground(BLANCO_PURO);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        boton.setFocusPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

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
     */
    public static void estiloPanelContenedor(JPanel panel) {
        panel.setOpaque(true);
        panel.setBackground(BLANCO_PURO);
        panel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(GRIS_BORDE, 1),
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));
    }

    /**
     * NUEVO: Aplica estilo al JLabel (texto principal)
     */
    public static void estiloJLabelPrincipal(JLabel label, String texto) {
        label.setText(texto);
        label.setFont(new Font("Segoe UI", Font.BOLD, 18));
        label.setForeground(ROJO_IES);
        label.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    /**
     * NUEVO: Aplica estilo al JLabel (texto secundario/normal)
     */
    public static void estiloJLabelNormal(JLabel label, String texto) {
        label.setText(texto);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(GRIS_TEXTO);
        label.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    /**
     * NUEVO: Aplica estilo al JLabel (texto destacado)
     */
    public static void estiloJLabelDestacado(JLabel label, String texto) {
        label.setText(texto);
        label.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));
        label.setForeground(AZUL_ENLACE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
    }
}