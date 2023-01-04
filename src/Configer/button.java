package Configer;

import java.awt.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

public class button extends JFrame {
    ButtonGroup g = new ButtonGroup();

    public button(JToggleButton[] btn, int x, int y, int width, int height, int space) {
        for (int i = 0; i < btn.length; i++) {
            btn[i].setBounds(x + i * space, y, width, height);
            btn[i].setContentAreaFilled(false);        //将按钮设为透明
            btn[i].setFocusable(false);        //去除按钮获得焦点时，文字周围的虚线
            btn[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    //鼠标点击时，去除鼠标 mouseMoved 事件 添加的背景色
                    JToggleButton btn = (JToggleButton)e.getSource();
                    btn.setBackground(null);
                }
                public void mouseExited(MouseEvent e){
                    JToggleButton btn = (JToggleButton)e.getSource();
                    if(!btn.isSelected()) {
                        btn.setContentAreaFilled(false);
                    }
                }
            });
            btn[i].addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseMoved(MouseEvent e){
                    //仅当鼠标没有处于点击状态时，才对按钮填充内容，并设置背景颜色
                    JToggleButton btn = (JToggleButton)e.getSource();
                    if(!btn.isSelected()) {
                        btn.setContentAreaFilled(true);
                        btn.setBackground(new Color(224, 242, 251));
                    }
                }
            });
            g.add(btn[i]);
            add(btn[i]);
        }
        setBounds(520,250,700,500);
        //如果没有设置为白色，需要在鼠标点击时，将按钮背景颜色置为其父级容器的背景颜色
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
    }
}

