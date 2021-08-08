import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JFrame implements ActionListener{

    String msg = "";
    JPanel p;
    JTextField tf;
    JRadioButton r1,r2,r3;
    ButtonGroup bg;
    JLabel lb;
    Container c;


    TrafficLight(){

        setLayout(new FlowLayout());
        c = getContentPane();
        c.setBackground(Color.pink);
        lb = new JLabel("Traffic Lights");
        tf = new JTextField(10);
        r1 = new JRadioButton("RED");
        r2 = new JRadioButton("GREEN");
        r3 = new JRadioButton("YELLOW");
        bg = new ButtonGroup();
        c.add(lb);
        c.add(r1);
        c.add(r2);
        c.add(r3);
        c.add(tf);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        setSize(400,400);
        setVisible(true);



    }
    public void actionPerformed(ActionEvent e){
        msg = e.getActionCommand();
        if(msg.equals("RED")){
            c.setBackground(Color.red);
            tf.setText(msg + ":" + "TURN ON");
        }
        else if(msg.equals("YELLOW")){
            c.setBackground(Color.yellow);
            tf.setText(msg + ":" + "TURN ON");
        }
        else if(msg.equals("GREEN")){
            c.setBackground(Color.green);
            tf.setText(msg + ":" + "TURN ON");
        }
        else{
            c.setBackground(Color.pink);
        }
    }
    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight();
        tl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}