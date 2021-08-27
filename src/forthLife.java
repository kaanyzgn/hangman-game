import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class forthLife extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawLine(200, 200, 300, 200);
		g2.drawLine(300, 200, 300, 250);
		g2.drawOval(250, 250, 100, 100);
		g2.drawLine(300, 350, 300, 500);
		g2.drawLine(300, 400, 350, 425);
		g2.drawLine(300, 400, 250, 425);
		g2.drawLine(300, 500, 350, 525);
		g2.drawLine(300, 500, 250, 525);
	}
}

