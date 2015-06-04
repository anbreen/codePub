package codePub;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HelloWorldJumpingApplet extends Applet implements ActionListener, MouseListener {

	String message = "This is applet state ";
	int x = 10;
	int y = 10;
	Button button;

	public void init() {

		message = message + "init() : ";
		addMouseListener(this);
		button = new Button("codepub");
		button.addActionListener(this);
		add(button);
	}

	public void start() {
		message = message + "start : ";
	}

	public void stop() {
		message = message + "stop : ";
	}

	public void destroy() {
		message = message + "destroy : ";
	}

	public void paint(Graphics g) {
		// g.drawString(message, 100, 100);
		g.setColor(Color.green);
		g.fillRect(x, y, 40, 40);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		button.setForeground(Color.BLUE);
	}

}
