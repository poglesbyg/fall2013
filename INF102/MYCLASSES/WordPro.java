import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WordPro {
    
    private static void box() {

        JFrame frame = new JFrame("WordPro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
                         
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this app's gui
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                box();
            }
        });
    }
}
