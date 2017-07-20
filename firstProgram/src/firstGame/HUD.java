package firstGame;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	public static int HEALTH = 100;
	
	public void tick(){
		
		HEALTH = Game.clamp(HEALTH, 0, 100);
		
	}
	
	public void render(Graphics g){
		g.setColor(Color.black);
		g.fillRect(15,15, 200, 8);
		g.setColor(Color.blue);
		g.fillRect(15,15, HEALTH * 2, 8);
		g.setColor(Color.white);
		g.drawRect(15,15, 200, 8);
		
	}

}
