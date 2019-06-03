import java.awt.Graphics;

public class ObjectManager
{
	Rocketship rocket;
	
	public ObjectManager(Rocketship r)
	{
		rocket = r;
	}
	
	void update()
	{
		rocket.update();
	}
	
	void draw(Graphics g)
	{
		rocket.draw(g);
	}
}
