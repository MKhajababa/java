import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

class Read extends JFrame{
    Read(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout  g = new GridLayout(0,3);
        setLayout(g);
        try{
            FileInputStream fin = new FileInputStream("Emp.tXt");
            Scanner sc = new Scanner(fin).useDelimiter(",");
            String[] arrayList;
            String a;
            while(sc.hasNextLine()){
                a = sc.nextLine();
                arrayList = a.split(",");
                for(String i:arrayList){
                    add(new JLabel(i));
                }
            }
        }    
            catch(Exception e){
                System.out.println(e);
            }
        setDefaultLookAndFeelDecorated(true);
        pack();
        setVisible(true);
    }
}

public class Reading{
    public static void main(String[] args) {
        Read r = new Read();
    }
}
