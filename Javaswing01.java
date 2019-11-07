package Javaswing01;
import javax.swing.*;
public class Javaswing01 {
    public static void main(String[] args) {
    JFrame f = new JFrame("title");
            JPanel p = new JPanel();
            JButton b = new JButton("press me");
            
            p.add(b);              
            f.setContentPane(p);  
            
            f.show();
    }
    
}
