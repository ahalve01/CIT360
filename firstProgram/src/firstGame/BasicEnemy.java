package firstGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class BasicEnemy extends GameObject {
	
	private Handler handler;

	public BasicEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
		this.handler = handler;
		velX = 5;
		velY = 5;
	}

	public Rectangle getBounds(){
		return new Rectangle(x,y, 60,60);
	}
	
	public void tick() {
		// TODO Auto-generated method stub
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 44) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 42) velX *= -1;
		
		handler.addObject(new Trail(x,y, ID.Trail, Color.GREEN, 10,10, 0.02f, handler));
	}


	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRoundRect(x, y, 20, 20, 20, 20);
		
	}
	
}
