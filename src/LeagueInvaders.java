import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders
{
	JFrame frame;
	GamePanel panel;
	
	final int width = 500;
	final int height = 800;
	
	public LeagueInvaders()
	{
		frame = new JFrame();
		panel = new GamePanel();
	}
	
	public static void main(String[] args)
	{
		LeagueInvaders li = new LeagueInvaders();
		li.setup();
	}
	
	void setup()
	{
		frame.add(panel);
		frame.addKeyListener(panel);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.startGame();
	}
}
