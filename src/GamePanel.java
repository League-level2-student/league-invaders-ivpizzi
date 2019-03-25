import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener
{
	Timer timer;
	GameObject game;
	
	public GamePanel()
	{
		timer = new Timer(100/60, this);
		game = new GameObject(100, 200, 50, 75);
	}
	
	void startGame()
	{
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
	
	@Override

	public void paintComponent(Graphics g)
	{
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		System.out.println("key typed works");
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		System.out.println("key pressed works");
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		System.out.println("key released works");
	}
}
