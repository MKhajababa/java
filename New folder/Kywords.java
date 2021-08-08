import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Kywords" width=300 height=100>
</applet>
*/
public class Kywords extends Applet implements KeyListener{
	String msg = "";
	int X = 10,Y = 20;
	public void init(){
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent e){
		showStatus("Key down");
	}
	public void keyReleased(KeyEvent e){
		showStatus("Key up");
	}
	public void keyTyped(KeyEvent e){
		msg += e.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,X,Y);

	}
}
