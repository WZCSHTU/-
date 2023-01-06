package buttonListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//背景音乐按钮的监听器
public class backgroundMusicListener implements ActionListener {
    int count = 0;
    public void actionPerformed(ActionEvent e) {
        count++;
        if (count%2==1){

        }else{

        }
        System.out.println("背景音乐已开启");
    }
}
