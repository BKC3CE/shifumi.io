package com.devops.tpAppliReseau;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static ShuFuMi scene;
    public static void main( String[] args )
    {
        //Fenêtre du jeu
        JFrame fenetre = new JFrame("Shifumi.cit");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(980,590);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setAlwaysOnTop(true);

        //Instanciation de l'objet scene
        scene = new ShuFuMi();

        fenetre.setContentPane(scene); //On associe la scene à la fenêtre du jeu
        fenetre.setVisible(true);


    }
}
