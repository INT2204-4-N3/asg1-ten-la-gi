package Graphics;

import dictionary.DictionaryCommandline;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
public class  DictionaryApplication {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public DictionaryApplication(){
        prepareGUI();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("DICTIONARY");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);

        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    public void showTextAreaDemo(){
        DictionaryCommandline word = new DictionaryCommandline();
        Scanner sc = new Scanner(System.in);
        String s;
        headerLabel.setText("English-Vietnamses");

        // JLabel  commentlabel= new JLabel("Word  ", JLabel.RIGHT);

        JTextArea commentTextArea = new JTextArea(1, 20);
        //commentTextArea.setForeground(Color.white);
        JScrollPane scrollPane = new JScrollPane(commentTextArea);

        JButton showButton = new JButton("Search");

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText( word.dictionarySearcher(commentTextArea.getText()));
            }
        });

        // controlPanel.add(commentlabel);
        controlPanel.add(scrollPane);
        controlPanel.add(showButton);
        mainFrame.setVisible(true);
    }


}