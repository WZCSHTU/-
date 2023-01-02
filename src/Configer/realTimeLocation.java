package Configer;

import java.awt.*;
import javax.swing.*;

/**
 * 将点从组件的坐标系转换为屏幕坐标,通过这种方式获取用户移动窗口后的具体坐标。
 *
 * @author 王子成
 * @version 1.0
 */
public class realTimeLocation {
    Point P = new Point();
    Component graphicsPanel = new Component() {
        @Override
        public int getX() {
            return super.getX();
        }

        @Override
        public int getY() {
            return super.getY();
        }
    };

    public realTimeLocation() {
        SwingUtilities.convertPointToScreen(P, graphicsPanel.getParent());
        P.x = graphicsPanel.getX();
        P.y = graphicsPanel.getY();
    }

    public int realTimeLocation_X(){
        return P.x;
    }

    public int realTimeLocation_Y(){
        return P.y;
    }
}
