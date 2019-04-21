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
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	public GamePanel()
	{
		timer = new Timer(100/60, this);
	}
	
	void startGame()
	{
		timer.start();
	}
	
	void updateMenuState()
	{
		
	}
	
	void updateGameState()
	{
		
	}
	
	void updateEndState()
	{
		
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
