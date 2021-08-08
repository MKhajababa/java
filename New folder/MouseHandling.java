import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
/*<applet code="MouseHandling" width=100 height=100> 
</applet> 
*/ 
public class MouseHandling extends Applet implements MouseListener,MouseMotionListener{
	String msg = "";
	int mouseX = 0,mouseY = 0;
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent e){
		mouseX = 0;
		mouseY = 10;
		msg = "MouseClicked";
		repaint();
	}
	public void mouseEntered(MouseEvent e){ 
		mouseX=0; 
		mouseY=10; 
		msg="Mouseentered"; 
		repaint(); 
	} 
	public void mouseExited(MouseEvent e){ 
		mouseX=0; 
		mouseY=10; 
		msg="Mouseexited"; 
		repaint(); 
	} 
	public void mousePressed(MouseEvent e){ 
		mouseX=e.getX(); 
		mouseY=e.getY(); 
		msg="down"; 
		repaint(); 
	} 
	public void mouseReleased(MouseEvent e){ 
		mouseX=e.getX(); 
		mouseY=e.getY(); 
		msg="up"; 
		repaint(); 
	} 
	public void mouseDragged(MouseEvent e){ 
		mouseX=e.getX(); 
		mouseY=e.getY(); 
		msg="*"; 
		showStatus("dragging mouse at"+mouseX+","+mouseY); 
		repaint(); 
	} 
	public void mouseMoved(MouseEvent e){ 
		showStatus("movingmouse at"+e.getX()+","+e.getY()); 
	} 
	public void paint(Graphics g){ 
		g.drawString(msg,mouseX,mouseY);
	} 
	


}