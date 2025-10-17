import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScribblePanel extends JPanel implements MouseListener, MouseMotionListener {
	int x;
	int y;
	int r = 10;

	ScribblePanel() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setFocusable(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		if (e.getModifiersEx()==InputEvent.BUTTON1_DOWN_MASK) {
			g.setColor(Color.BLACK);
			g.drawLine(x, y, e.getX(), e.getY());

		} else {
			g.setColor(getBackground()); // Color matches background to erase
			g.fillOval(e.getX() - r, e.getY() - r, 2 * r, 2 * r); // Eraser size
		}
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		super.paintComponent(g);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
