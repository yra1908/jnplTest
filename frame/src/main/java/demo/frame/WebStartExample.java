package demo.frame;

import javax.jnlp.ServiceManager;
import javax.jnlp.SingleInstanceListener;
import javax.jnlp.SingleInstanceService;
import javax.jnlp.UnavailableServiceException;
import javax.swing.*;
import java.awt.*;
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

    public static void main(final String[] args) {


        jFrame.add(jPanel);

        try {
            SingleInstanceService singleInstanceService = (SingleInstanceService) ServiceManager.lookup("javax.jnlp.SingleInstanceService");
            singleInstanceService.addSingleInstanceListener(new SingleInstanceListener() {
                private int count;
                @Override public void newActivation(String[] args) {
                    //System.out.println(EventQueue.isDispatchThread());
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            JOptionPane.showMessageDialog(jFrame, "already running: " + count);
                            jFrame.setTitle("title:" + count);
                            count++;
                        }
                    });
                }
            });
        } catch (UnavailableServiceException ex) {
            ex.printStackTrace();
            return;
        }

        if (args.length == 0) {
            System.out.println("No args");
        }
        ((JButton) jPanel.add(new JButton("click"))).addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("clicked!");

                        for (String arg : args) {
                            System.out.println(arg);
                        }

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
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;

    }
}
