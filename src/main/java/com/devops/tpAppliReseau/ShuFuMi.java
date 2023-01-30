package com.devops.tpAppliReseau;

import javax.swing.*;
import java.awt.*;

public class ShuFuMi extends JPanel{

    private ImageIcon icon;
    private Button start;
    private ImageIcon iconbtn;
    private Image imgbtn;
    private Image image;
    private int xFond;
    //Constructeur
    public ShuFuMi(){
        super();

        this.xFond = -50;

        start = new Button();
        icon = new ImageIcon("src/main/java/images/fondecranAccueil.png");
        this.image = this.icon.getImage();
    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics graphics1 = (Graphics) graphics;

        graphics1.drawImage(this.image, this.xFond, 0, null);
    }
}
