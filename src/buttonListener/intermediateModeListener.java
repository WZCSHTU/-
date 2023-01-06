package buttonListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//中级模式按钮的监听器
public class intermediateModeListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("欢迎玩家来到中级模式");
    }
}
