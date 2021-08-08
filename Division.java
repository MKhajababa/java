
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class Division extends JFrame implements ActionListener {
    
    JButton btn;
    JTextField tf1,tf2,tf3;
    JLabel lb1,lb2,lb3;
    Container c;
    JPanel p;
    public Division(){
        c = getContentPane();
        c.setBackground(Color.RED);
        btn = new JButton("Divide");
        tf1 =new JTextField(30);
        tf2 =new JTextField(30);
        tf3 =new JTextField(30);
        lb1 = new JLabel("NUM 1");
        lb2 = new JLabel("NUM 2");
        lb3 = new JLabel("RESULT");
        p = new JPanel();
        p.setLayout(new GridLayout(3,2));
        p.add(lb1);p.add(tf1);
        p.add(lb2);p.add(tf2);
        p.add(lb3);p.add(tf3);
        c.add(new JLabel("Division"),"North");
        c.add(p,"Center");
        c.add(btn, "South");
        btn.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==btn){
            try{
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                int c = a/b;
                tf3.setText(""+c);
            }
            catch(NumberFormatException ex){
                tf3.setText("--");
                JOptionPane.showMessageDialog(this, "Incorrect input Format");
            }
            catch(ArithmeticException ex){
                tf3.setText("--");
                JOptionPane.showMessageDialog(this, "Divide by Zero");
            }
            catch(Exception ex){
                tf3.setText("--");
                JOptionPane.showMessageDialog(this, "The Exception "+ex.getMessage());
            }
        }
        
    }   
    public static void main(String[] args) {
        Division d = new Division();
        d.setSize(400,400);
        d.setVisible(true);
    }
}
