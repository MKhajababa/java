import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class A extends JFrame{
    public A(){
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0,3));
        try{
            FileInputStream fin = new FileInputStream("Emp.txt");
            Scanner sc = new Scanner(fin).useDelimiter(",");
            String arr[];
            String a;
            while(sc.hasNextLine()){
                a = sc.nextLine();
                arr = a.split(",");
                for(String i:arr){
                    add(new JLabel(i));
                }
            }
            sc.close();
        }
        catch(Exception e){

        }
        
        setDefaultLookAndFeelDecorated(true);
        pack();
        setVisible(true);

    }
}

public class ReadingFile {
    public static void main(String[] args) {
        new A();
    }
}
