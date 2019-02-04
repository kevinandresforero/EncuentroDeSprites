/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVIN
 */
public class Personaje {
    private BufferedImage image;
    
    public void BuscarImagen(){
        try {
            image = ImageIO.read(getClass().getClassLoader().getResource("KBn.png"));
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen KBn.png");
        }
    }
}
