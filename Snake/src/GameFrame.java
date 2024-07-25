import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){		
		this.add(new GamePanel());
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Makes it so you cant change the window size in the game
		this.setResizable(false);
		//Makes it so that the window can get sized
		this.pack();
		//Makes it so that you can see the window
		this.setVisible(true);		
		this.setLocationRelativeTo(null);
		
	}

}
