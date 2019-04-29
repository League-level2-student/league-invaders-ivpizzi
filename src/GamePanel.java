import java.awt.Color;
import java.awt.Font;
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
	Font titleFont;
	Font gameOverFont;
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	public GamePanel()
	{
		timer = new Timer(100/60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		gameOverFont = new Font("Arial", Font.PLAIN, 48);
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
	
	void drawMenuState(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("League Invaders", 65, 100);
	}
	
	void drawGameState(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	}
	
	void drawEndState(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(gameOverFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 90, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		repaint();
		
		if(currentState == MENU_STATE)
		{
            updateMenuState();
		}
		else if(currentState == GAME_STATE)
		{
            updateGameState();
		}
		else if(currentState == END_STATE)
		{
            updateEndState();
		}
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		if(currentState == MENU_STATE)
		{
            drawMenuState(g);
		}
		else if(currentState == GAME_STATE)
		{
            drawGameState(g);
		}
		else if(currentState == END_STATE)
		{
            drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			currentState++;
			if(currentState > END_STATE)
			{
                currentState = MENU_STATE;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
	}
}
