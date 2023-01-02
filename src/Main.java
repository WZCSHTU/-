import java.io.IOException;
import Configer.*;

public class Main {
    public static void main(String[] args) {
        //向用户发出提示
        System.out.println("游戏启动中。。。。。。");

        //初始化程序窗口
        initWindow window = new initWindow();

        //打印出用户窗口的原始位置
        System.out.println("原始窗口的横坐标是:"+window.getLocation_X()+" 原始窗口的纵坐标是："+window.getLocation_Y());

        //让用户的进程暂停几秒
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("这里不能让进程暂停");
        }

        //当用户移动了窗口，我们希望获取用户窗口的最新位置
        realTimeLocation location = new realTimeLocation();
        System.out.println("当前窗口的横坐标为："+location.realTimeLocation_X()+"当前窗口的纵坐标是："+location.realTimeLocation_Y());


        System.out.println("Hello world!");
    }
}