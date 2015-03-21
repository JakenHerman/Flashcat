package flashcat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class FlashcatWindows extends JFrame {

    // Variables declaration - do not modify
    private javax.swing.JLabel browserLabel;
    private javax.swing.JButton chromeButton;
    private javax.swing.JButton firefoxButton;
    private javax.swing.JLabel osLabel;
    // End of variables declaration


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FlashcatWindows().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private JPanel cards;
    private CardLayout cardLayout;
    private static final String firefoxTag = "Firefox";
    private static final String chromeTag = "Chrome";

    public FlashcatWindows() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        osLabel = new javax.swing.JLabel();
        firefoxButton = new javax.swing.JButton();
        chromeButton = new javax.swing.JButton();
        browserLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        osLabel.setText("Windows Downloader");

        firefoxButton.setText("Firefox");
        File firefox_file_windows = new File("~/Windows/Firefox Setup 36.0.1.exe");


        chromeButton.setText("Chrome");
        File chrome_file_windows = new File("~/Windows/ChromeSetup.exe");

        browserLabel.setText("Web Browsers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addComponent(osLabel)
                .addGap(352, 352, 352))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(chromeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(firefoxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(browserLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(osLabel)
                .addGap(51, 51, 51)
                .addComponent(browserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firefoxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chromeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        pack();
    }

    void fwCaller() {
        try {
            new FlashcatMac().setVisible(true);
        } catch (Exception e) {
        }
    }

}
