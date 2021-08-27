import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class secondLife extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawLine(200, 200, 300, 200);
		g2.drawLine(300, 200, 300, 250);
		g2.drawOval(250, 250, 100, 100);
		g2.drawLine(300, 350, 300, 500);
	}
}
