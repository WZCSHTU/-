import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import buttonListener.*;
import buttonListener.aboutListener;
import buttonListener.backgroundMusicListener;
import buttonListener.intermediateModeListener;
import buttonListener.seniorModeListener;
import buttonListener.simpleModeListener;
import buttonListener.repentanceModeListener;

/**
 * 初始化窗口
 *
 * @author 王子成
 * @version 3.0
 */
public class initWindow {
    static int location_X = 0;
    static int location_Y = 0;
    static int mid_X = 0;
    static int mid_Y = 0;
    static int image_width = 450; //计算机量出来的是450
    static int image_height = 498;
    static int width = image_width + 13;
    static int height = image_height + 100;
    static int button_width = 100;
    static int button_height = 30;
    static int button_spacing = (width - button_width * 3) / 2;

    public initWindow() {
        //向用户发出提示
        System.out.println("窗口初始化中。。。。。。");

        // 获取用户电脑的长度和宽度
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        GraphicsConfiguration[] gc = gs[0].getConfigurations();
        location_X = (int) gc[0].getBounds().getWidth();
        location_Y = (int) gc[0].getBounds().getHeight();
        System.out.println("适配用户电脑环境中。。。。。。");
        System.out.println("检测到当前用户电脑环境中有" + gs.length + "台显示设备！");
        System.out.println("获取到用户当前显示器的长为: " + location_X + "显示器的宽为：" + location_Y);
        System.out.println("适配中。。。。。。");

        // 建立窗体
        JFrame jf = new JFrame();
        mid_X = (location_X - width) / 2;
        mid_Y = (location_Y - height) / 2;
        jf.setTitle("中国象棋——却凭纹楸聊自笑,雄如刘项亦闲争.");
        jf.setBounds(mid_X, mid_Y, width, height);
        jf.setVisible(true);
        jf.setResizable(false);

        //向用户界面添加按钮
        initButton(jf);

        //加载用户图形界面
        initGui(jf);

        //提示用户程序工作情况
        System.out.println("窗口初始化完成！");
    }

    public void initGui(JFrame jf_) {
        // 在窗体中绘制棋盘
        ImageIcon icon = new ImageIcon("./bg.jpg");
        JLabel label = new JLabel(icon);
        jf_.setLayout(null);
        jf_.add(label);
        label.setBounds(0, 0, image_width, image_height);

        //在窗体中绘制背景
        ImageIcon Icon = new ImageIcon("./bg1.png");
        JLabel Label = new JLabel(Icon);
        jf_.setLayout(null);
        jf_.add(Label);
        Label.setBounds(0, image_height - 10, width, height);
        Label.setVisible(true);
    }

    public void initButton(JFrame jf_) {
        //按照流式布局组件
        jf_.setLayout(new FlowLayout());

        //向窗体中添加按钮
        JButton btn0 = new JButton("简单模式");
        JButton btn1 = new JButton("中级模式");
        JButton btn2 = new JButton("高级模式");
        JButton btn3 = new JButton("悔棋");
        JButton btn4 = new JButton("背景音乐");
        JButton btn5 = new JButton("关于我们");

        ActionListener SimpleModeListener = new simpleModeListener();
        ActionListener IntermediateModeListener = new intermediateModeListener();
        ActionListener SeniorModeListener = new seniorModeListener();
        ActionListener RepentanceModeListener = new repentanceModeListener();
        ActionListener BackgroundMusicListener = new backgroundMusicListener();
        ActionListener AboutListener =  new aboutListener();

        btn0.addActionListener(SimpleModeListener);
        btn1.addActionListener(IntermediateModeListener);
        btn2.addActionListener(SeniorModeListener);
        btn3.addActionListener(RepentanceModeListener);
        btn4.addActionListener(BackgroundMusicListener);
        btn5.addActionListener(AboutListener);

        jf_.add(btn0);
        jf_.add(btn1);
        jf_.add(btn2);
        jf_.add(btn3);
        jf_.add(btn4);
        jf_.add(btn5);

          //设置按钮为透明
//        btn0.setContentAreaFilled(false);
//        btn1.setContentAreaFilled(false);
//        btn2.setContentAreaFilled(false);
//        btn3.setContentAreaFilled(false);
//        btn4.setContentAreaFilled(false);
//        btn5.setContentAreaFilled(false);

        btn0.setBounds(0, image_height, button_width, button_height);
        btn1.setBounds(button_width * 1 + button_spacing * 1, image_height, button_width, button_height);
        btn2.setBounds(button_width * 2 + button_spacing * 2 - 15, image_height, button_width, button_height);
        btn3.setBounds(0, image_height + 30, button_width, button_height);
        btn4.setBounds(button_width * 1 + button_spacing * 1, image_height + 30, button_width, button_height);
        btn5.setBounds(button_width * 2 + button_spacing * 2 - 15, image_height + 30, button_width, button_height);
    }

    public int getLocation_X() {
        return location_X;
    }

    public int getLocation_Y() {
        return location_Y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getMid_X() {
        return mid_X;
    }

    public int getMid_Y() {
        return mid_Y;
    }

    public int getButton_width() {
        return button_width;
    }

    public int getButton_height() {
        return button_height;
    }

    public int getButton_spacing() {
        return button_spacing;
    }
}