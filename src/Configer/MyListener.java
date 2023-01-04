package Configer;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

public class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("用户点击了我"+this);
    }
}
