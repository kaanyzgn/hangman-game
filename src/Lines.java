import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Lines extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawLine(151, 160, 163, 160);
		g2.drawLine(166, 160, 178, 160);
		g2.drawLine(181, 160, 193, 160);
		g2.drawLine(196, 160, 208, 160);
	}

}
