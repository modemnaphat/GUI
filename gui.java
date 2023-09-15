package GUI;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class gui {
    public static void main(String[] args) {
        mainFrame myFrame = new mainFrame();
        myFrame.init();
    }
}

class mainFrame extends JFrame{
    public void init(){
        //JPanel mainPanel = new JPanel();
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JLabel Fname = new JLabel("First Name");
        JTextField TFname = new JTextField();
        JLabel Lname = new JLabel("Last Name");
        JTextField TLname = new JTextField();

        JButton OK = new JButton("OK");
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TFname.setText("Naphat");
                TLname.setText("Mahakheta");
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        setTitle("GUI");
        setSize(500, 500);
        
        mainPanel.setLayout(new GridLayout(4,1,5,5));
        mainPanel.add(Fname);
        mainPanel.add(TFname);
        mainPanel.add(Lname);
        mainPanel.add(TLname);
        mainPanel.add(OK);

        getContentPane().add(mainPanel);
        setVisible(true);
    }
}