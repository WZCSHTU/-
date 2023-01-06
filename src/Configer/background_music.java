package Configer;

//import java.applet.Applet;
//import java.applet.AudioClip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class background_music {
    static Clip clip;
    public  static void playBackground_music(){
        try{
            //音乐的绝对路径
            File musicPath = new File("./Desktop/eclipse_java/java01/ideaProject01/goBang/bgMusic.mp3");

            if (musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                FloatControl gainControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl.setValue(-20.0f); //设置音量，范围为 -60.0f 到 6.0f
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }else{
                System.out.println("⚠这里出现了一些问题导致无法播放音乐！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
