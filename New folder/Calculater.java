import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "Calculater.java" width = 500 height=500></applet>*/

public class Calculater extends Applet implements ActionListener{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,clear,add,minus,mul,div,clc,equal;
	TextField tf;
	String msg = "",op = "";
	int a,b,count;
	public void init(){
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		b0 = new Button("0");
		clear = new Button("C");
		add = new Button("+");
		minus = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		equal = new Button("=");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		add.addActionListener(this);
		minus.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		equal.addActionListener(this);
		tf = new TextField(30);
		setLayout(new GridLayout(5,5));
		add(tf);
		add(clear);
		add(equal);
		add(div);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(add);
		add(b4);
		add(b5);
		add(b6);
		add(minus);
		add(b7);
		add(b8);
		add(b9);
		add(mul);
	}

	public void actionPerformed(ActionEvent ie){
		switch(ie.getActionCommand()){
			case "1": msg = msg+"1";
			tf.setText(msg);
			break;
			case "2": msg = msg+"2";
			tf.setText(msg);
			break;
			case "3": msg = msg+"3";
			tf.setText(msg);
			break;
			case "4": msg = msg+"4";
			tf.setText(msg);
			break;
			case "5": msg = msg+"5";
			tf.setText(msg);
			break;
			case "6": msg = msg+"6";
			tf.setText(msg);
			break;
			case "7": msg = msg+"7";
			tf.setText(msg);
			break;
			case "8": msg = msg+"8";
			tf.setText(msg);
			break;
			case "9": msg = msg+"9";
			tf.setText(msg);
			break;
			case "0": msg = msg+"0";
			tf.setText(msg);
			break;
			case "+":if(count ==0){
				b = Integer.parseInt(tf.getText());
				op = "+";
				tf.setText("");
				msg = "";
				count++;
			}
			else{
				a = Integer.parseInt(tf.getText());
				Math1(b,a,op);
				tf.setText("");
				msg = "";

			}
			break;
			case "-":if(count ==0){
				b = Integer.parseInt(tf.getText());
				op = "-";
				tf.setText("");
				msg = "";
				count++;
			}
			else{
				a = Integer.parseInt(tf.getText());
				Math1(b,a,op);
				tf.setText("");
				msg = "";

			}
			break;
			case "*":if(count ==0){
				b = Integer.parseInt(tf.getText());
				op = "*";
				tf.setText("");
				msg = "";
				count++;
			}
			else{
				a = Integer.parseInt(tf.getText());
				op = "*";
				Math1(b,a,op);
				tf.setText("");
				msg = "";

			}
			break;
			case "/":if(count ==0){
				b = Integer.parseInt(tf.getText());
				op = "/";
				tf.setText("");
				msg = "";
				count++;
			}
			else{
				a = Integer.parseInt(tf.getText());
				op = "/";
				Math1(b,a,op);
				tf.setText("");
				msg = "";

			}
			break;
			case"C":tf.setText("");
			b = 0;
			msg = "";
			count = 0;
			break;
			case "=":a = Integer.parseInt(tf.getText());
			Math1(b,a,op);
			tf.setText(""+b);
			count = 0 ;msg = "";
			break;


		}
	}
    public void Math1(int b1,int a1,String op1){
    	switch(op1){
    		case "+":
    		b = b1+a1;
    		break;
    		case "-":
    		b = b1-a1;
    		break;
    		case "*":
    		b = b1*a1;
    		break;
    		case "/":
    		b = b1/a1;
    		break;

    	}
    }
}
