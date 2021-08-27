import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class noChance extends JComponent {
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setFont(new Font("Arial",Font.LAYOUT_RIGHT_TO_LEFT,20));
		g2.setColor(Color.RED);
		g2.drawString("You do not have more chances please start a new game", 140, 650);


}
}