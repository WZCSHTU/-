package buttonListener;

import java.awt.event.*;

//简单模式按钮的监听器
public class simpleModeListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("欢迎玩家来到简单模式");
    }
}
