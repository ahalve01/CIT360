package gettingItRight;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;

public class Test{

    public static void main(String args[]) {
        JFrame myFrame = new JFrame();
        String myTitle = "Blank Frame";
        
        myFrame.setBackground(Color.BLUE);
        myFrame.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 12));
        myFrame.setTitle(myTitle);
        myFrame.setLayout(new FlowLayout());
        myFrame.setSize(600, 400);
        myFrame.setDefaultCloseOperation
            (JFrame.EXIT_ON_CLOSE);
        
        myFrame.setVisible(true);
    }
    
}

