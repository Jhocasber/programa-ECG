package ecg;

import java.awt.Color;
import java.awt.Graphics;

public class grafica extends javax.swing.JPanel {
	
int dato;
int tiempo;
public grafica(int valor){
	this.dato=valor;
	this.tiempo=tiempo;
}
public void paintComponent(Graphics g) { 
	int a=dato;
	int	b=tiempo;
	 super.paintComponent(g);
	 getBackground();
	 g.setColor(Color.BLACK);
g.drawLine(0, 0, 100,100);
	
}
}
