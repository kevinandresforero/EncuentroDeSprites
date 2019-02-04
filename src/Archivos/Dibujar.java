/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import javax.swing.ImageIcon;
import java.awt.Graphics;
/**
 *
 * @author Kebuun
 */
public class Dibujar {
    String Cat = "cat_fighter_sprite1";
    ImageIcon dibujo = new ImageIcon(new ImageIcon(getClass().getResource(Cat)).getImage());
    
    public void CargarImagen(Graphics g){
        g.drawImage(dibujo.getImage(), 50, 50, 100, 100, null);
        
    }
    
    
}
