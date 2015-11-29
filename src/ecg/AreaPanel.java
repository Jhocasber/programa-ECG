package ecg;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class AreaPanel extends JPanel {
//	int ancho=100,alto=100,radio=100;
//	public void parametro(int an, int al, int rad){
//		ancho=an;
//		alto=al;
//		radio=rad;
//	}
  public void paintComponent(Graphics gra) {
	  setBackground(Color.BLACK);
      Graphics2D dibujo= (Graphics2D) gra;
      dibujo.drawLine(430, 0, 430, 500);
  }
} 