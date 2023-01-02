import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 * 初始化窗口
 * @author 王子成
 * @version 2.0
 */
public class initWindow {
    static int location_X = 0;
    static int location_Y = 0;
    static int mid_X = 0;
    static int mid_Y = 0;
    static int width = 450;
    static int height = 503;

    public initWindow() {
        //向用户发出提示
        System.out.println("窗口初始化中。。。。。。");

        // 获取用户电脑的长度和宽度
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        GraphicsConfiguration[] gc = gs[0].getConfigurations();
        location_X = (int) gc[0].getBounds().getWidth();
        location_Y = (int) gc[0].getBounds().getHeight();

        // 建立窗体
        JFrame jf = new JFrame();
        mid_X = (location_X - width) / 2;
        mid_Y = (location_Y - height) / 2;
        jf.setTitle("中国象棋——却凭纹楸聊自笑,雄如刘项亦闲争.");
        jf.setBounds(mid_X, mid_Y, width + 10, height + 70);
        jf.setVisible(true);
        jf.setResizable(false);

        //在窗体中绘制背景
        ImageIcon Icon = new ImageIcon("./bg1.png");
        JLabel Label = new JLabel(Icon);
        jf.setLayout(null);
        jf.add(Label);
        Label.setBounds(0, height - 5, width, height);
        Label.setVisible(true);

        // 在窗体中绘制棋盘
        ImageIcon icon = new ImageIcon("./bg.jpg");
        JLabel label = new JLabel(icon);
        jf.setLayout(null);
        jf.add(label);
        label.setBounds(0, 0, width, height);
        label.setVisible(true);

        //打印工作效果
        System.out.println("窗口初始化完成！");
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
}