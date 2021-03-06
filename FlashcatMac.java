package flashcat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class FlashcatMac extends JFrame {

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

    public FlashcatMac() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        osLabel = new javax.swing.JLabel();
        firefoxButton = new javax.swing.JButton();
        chromeButton = new javax.swing.JButton();
        browserLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        osLabel.setText("Macintosh Downloader");

        firefoxButton.setText("Firefox");
        firefoxButton.addActionListener(new java.awt.event.ActionListener(){
          public void actionPerformed (java.awt.event.ActionEvent evt){
            try{
            firefoxButtonActionPerformed(evt);
          } catch (IOException ex){
            Logger.getLogger(FlashcatMac.class.getName()).log(Level.SEVERE, null, ex);
          }
          }
        });

        chromeButton.setText("Chrome");
        chromeButton.addActionListener(new java.awt.event.ActionListener(){
          public void actionPerformed (java.awt.event.ActionEvent evt){
            try{
            chromeButtonActionPerformed(evt);
          } catch (IOException ex){
            Logger.getLogger(FlashcatMac.class.getName()).log(Level.SEVERE, null, ex);
          }
          }
        });

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

    private void firefoxButtonActionPerformed(java.awt.event.ActionEvent evt){
      String filepath = new File("/Mac/Firefox 36.0.1.dmg").getAbsolutePath();
      File firefox_file = new File(filepath);
      try{
        Desktop.getDesktop().open(firefox_file);
      } catch(IOException e){
      }
    }

    private void chromeButtonActionPerformed(java.awt.event.ActionEvent evt){
      String filepath = new File("/Mac/googlechrome.dmg").getAbsolutePath();
      File chrome_file = new File(filepath);
      try{
        Desktop.getDesktop().open(chrome_file);
      } catch(IOException e){

      }
    }

    void fmCaller() {
        try {
            new FlashcatMac().setVisible(true);
        } catch (Exception e) {
        }
    }

}
