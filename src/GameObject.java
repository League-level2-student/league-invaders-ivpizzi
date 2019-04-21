import java.awt.Graphics;

public class GameObject
{
	 int x;
     int y;
     int width;
     int height;
	
	public GameObject(int newX, int newY, int newWidth, int newHeight)
	{
		x = newX;
		y = newY;
		width = newWidth;
		height = newHeight;
	}
	
	void update()
	{
		x++;
	}
	
	void draw(Graphics g)
	{
		g.fillRect(x, y, 100, 100);
	}
}
