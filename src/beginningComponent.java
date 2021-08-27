import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class beginningComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawLine(180, 200, 300, 200);
		g2.drawLine(300, 200, 300, 250);
		g2.drawLine(180, 200, 180, 550);
		g2.drawLine(240, 550, 120, 550);
		g2.setFont(new Font("Arial",Font.BOLD,16));
		g2.setColor(Color.BLACK);
		g2.drawString("THIS IS THE YOUR WORD", 120, 130);
		g2.drawString("Please select the letter that you think", 470,50);
		g2.drawString("is in your word.", 550, 70);
		g2.drawString("!!! Choosen letter will  dissapear." , 480, 380);
		
	}
	
}

