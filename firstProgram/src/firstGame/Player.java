package firstGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject {
	
	Random r = new Random();
	Handler handler;

	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
		this.handler = handler;
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x,y, 15,15);
	}
	
	public void tick(){
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 32);
		y = Game.clamp(y, 0, Game.HEIGHT - 40);
		
		collision();
	}
	
	private void collision(){
		for(int i = 0; i < handler.object.size(); i++){
			
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.BasicEnemy){ // tempObject is now basic enemy
				if(getBounds().intersects(tempObject.getBounds())){
					// Collision code
				HUD.HEALTH -= 2;
				}
				
			}
		}
	}
	
	
	public void render(Graphics g){
		g.setColor(Color.red);
		g.fillArc( x, y, 80, 80, 60, 60);
		
	}

}
