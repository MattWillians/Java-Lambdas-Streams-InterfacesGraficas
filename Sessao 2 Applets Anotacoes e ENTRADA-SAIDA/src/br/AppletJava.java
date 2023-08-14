package br;

import javax.swing.*;
import java.awt.*;

//Lembrando que os Applets estão descontinuados...
public class AppletJava extends JApplet {

    private static final long serialVersionUID = 1;

    @Override
    public void init() {

        System.out.println("Iniciando sistema");
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(0,0,200,200);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Times New Roman",Font.BOLD,20));
        g.drawString("Ola galera",20,20);
    }

    @Override
    public void start() {
        System.out.println("Executando sistema...");
    }

    @Override
    public void stop() {
        System.out.println("Parando o sistema...");
    }

    @Override
    public void destroy() {
        System.out.println("Eliminando memoria...");
    }

}