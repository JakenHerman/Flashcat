package flashcat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class FlashcatMac extends JFrame {

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
        setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel(new GridLayout(2,1));
        contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
        add(contentPane);

        JPanel radioPanel = new JPanel(new GridLayout(0,1));
        JRadioButton firefoxButton = new JRadioButton("Firefox");
        firefoxButton.setActionCommand(firefoxTag);
        firefoxButton.setSelected(true);
        JRadioButton chromeButton = new JRadioButton("Chrome");
        chromeButton.setActionCommand(chromeTag);
        ButtonGroup group = new ButtonGroup();
        group.add(firefoxButton);
        group.add(chromeButton);
        radioPanel.add(firefoxButton);
        radioPanel.add(chromeButton);
        contentPane.add(radioPanel);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);
        JPanel firefoxCard = new JPanel(new BorderLayout());
        firefoxCard.add(new Label("Firefox card"), BorderLayout.CENTER);
        JPanel chromeCard = new JPanel(new BorderLayout());
        chromeCard.add(new Label("Chrome card"), BorderLayout.CENTER);
        cards.add(firefoxCard, firefoxTag);
        cards.add(chromeCard, chromeTag);
        contentPane.add(cards);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, e.getActionCommand());
            }
        };
        firefoxButton.addActionListener(listener);
        chromeButton.addActionListener(listener);
        pack();
    }

    void fmCaller() {
        try {
            new FlashcatWindows().setVisible(true);
        } catch (Exception e) {
        }
    }

}