/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author Estudiant
 */
public class Navegacion {
    private static final String URL_WEB = "https://avdi-gva.prod.gcp-eu.taocloud.org/login";

    public static void abrirPagina() {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(URL_WEB));
            }
        } catch (Exception e) {
            System.err.println("Error al abrir navegador: " + e.getMessage());
        }
    }
}
