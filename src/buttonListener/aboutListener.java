package buttonListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

//关于我们按钮的监听器
public class aboutListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (java.awt.Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().open(new File("./aboutUs.html"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("关于我们！");
    }
}
