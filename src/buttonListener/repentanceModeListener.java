package buttonListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//悔棋按钮的监听器
public class repentanceModeListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("悔棋成功！");
    }
}
