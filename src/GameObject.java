import java.awt.Graphics;

public class GameObject
{
	 int x;
     int y;
     int width;
     int height;
     
     boolean isAlive;
	
	public GameObject(int newX, int newY, int newWidth, int newHeight)
	{
		x = newX;
		y = newY;
		width = newWidth;
		height = newHeight;
		
		isAlive = true;
	}
	
	void update()
	{
		
	}
	
	void draw(Graphics g)
	{
		
	}
}
