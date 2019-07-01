import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager
{
	Rocketship rocket;
	ArrayList<Projectile> lasers = new ArrayList();
	
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
