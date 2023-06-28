import javax.swing.*;

public class Java09_swing {
    public static void main(String[] args){
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(200,100,100,100);
        f.add(b);
        f.setSize(500,400);
        f.setLayout(null);  // uses no layout manager
        f.setVisible(true); // makes the frame visible
    }
}
