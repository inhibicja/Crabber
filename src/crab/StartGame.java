/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crab;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public class StartGame extends Canvas implements Runnable{

	public void run() {	
	}
        
	protected void paint(Graphics graf) {
            graf.setColor(255, 255, 255);
            graf.fillRect(0, 0, getWidth(), getHeight());
            graf.setColor(220, 68, 37); 
            graf.drawString("Crabber", getWidth() / 2, getHeight() / 2, Graphics.HCENTER | Graphics.BASELINE);
            graf.drawString("Mateusz Gajewski", 1, getHeight(), Graphics.BOTTOM | Graphics.LEFT);
	}
}
