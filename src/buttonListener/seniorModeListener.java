package buttonListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//高级模式按钮的监听器
public class seniorModeListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("欢迎玩家来到高级模式");
    }
}
