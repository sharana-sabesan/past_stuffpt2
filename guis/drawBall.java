import javax.swing.*;
import java.awt.*;
public class drawBall extends JPanel {
		Graphics a;
	public void drawing() {
		paintComponent(a);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D shapes = (Graphics2D)g.create();
		
		Shape recct = new Rectangle(90,80,100,100);
			shapes.setColor(Color.GREEN);
			shapes.fill(recct);
		//g.drawOval(90, 70,100,100);
		
	}
}
