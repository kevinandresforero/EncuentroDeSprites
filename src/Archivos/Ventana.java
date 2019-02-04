/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import javax.swing.JFrame;

/**
 *
 * @author Kebuun
 */
public class Ventana extends JFrame {
    
        public int ancho = 1000 , alto = 700 ;
    public Ventana(){
        Dibujar d = new Dibujar();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Encuentro De Sprites");
        setSize(ancho, alto);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

public static void main(String[] args){
        
        Ventana v = new Ventana();   

    }    
}

