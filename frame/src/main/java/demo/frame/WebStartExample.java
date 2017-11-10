package demo.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URISyntaxException;

/**
 * Created by ychikh on 09.11.2017.
 */
public class WebStartExample {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        ((JButton)jPanel.add(new JButton("click"))).addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("clicked!");
                        try {
                            System.out.println("*****************************************");
                            System.out.println(new File(WebStartExample.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).toString());
                            System.out.println("*****************************************");
                        } catch (URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
        );
    }

    private static JFrame getFrame() {
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setBounds(750,250,500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;

    }
}
