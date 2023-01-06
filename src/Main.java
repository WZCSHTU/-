import java.io.IOException;
import Configer.*;

public class Main {
    public static void main(String[] args) {
        //向用户发出提示
        System.out.println("游戏启动中。。。。。。");

        //向程序中加入背景音乐
        background_music music = new background_music();
        music.playBackground_music();

        //窗口美化
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        //初始化程序窗口
        initWindow window = new initWindow();

        System.out.println("Hello world!");
    }
}