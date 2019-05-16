package Macias260.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.*;

public class TextEditor extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JFrame frame;
    private Menu menu;

    public TextEditor() throws HeadlessException {
        menu = new Menu();
        frame = new JFrame("Notepad");
        textArea = new JTextArea();

//        Add action listener
        menu.menuItem1.addActionListener(this);
        menu.menuItem2.addActionListener(this);
        menu.menuItem3.addActionListener(this);
        menu.menuItem4.addActionListener(this);
        menu.menuItem5.addActionListener(this);
        menu.menuItem6.addActionListener(this);
        menu.menuItem7.addActionListener(this);
        menu.menuItem8.addActionListener(this);

//        set frame properties
        frame.setJMenuBar(menu.menuBar);
        frame.add(textArea);
        frame.setSize(800, 500);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String st = e.getActionCommand();

        if (st.equals("New")) {
            TextEditor t = new TextEditor();
        } else if (st.equals("Open")) {
            JFileChooser fileChooser = new JFileChooser();

            int i = fileChooser.showOpenDialog(null);
            if (i == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    String s1, s2;
                    FileReader fileReader = new FileReader(file);
                    BufferedReader br = new BufferedReader(fileReader);
                    s2 = br.readLine();

                    while ((s1 = br.readLine()) != null) {
                        s2 = s2 + "\n" + s1;
                    }

                    TextEditor textEditor = new TextEditor();
                    textEditor.textArea.setText(s2);

                } catch (Exception evt) {
                    JOptionPane.showMessageDialog(frame, evt.getMessage());
                }
            }
        } else if (st.equals("Save")) {
            JFileChooser fileChooser = new JFileChooser();
            int i = fileChooser.showOpenDialog(null);
            if (i == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    FileWriter fileWriter = new FileWriter(file, false);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(textArea.getText());
                    bufferedWriter.flush();
                    bufferedWriter.close();
                } catch (IOException exception) {
                    JOptionPane.showMessageDialog(frame, exception.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Operation was canceled");
            }
        } else if (st.equals("Print")) {
            try {
                textArea.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        } else if (st.equals("Cut")) {
            textArea.cut();
        } else if (st.equals("Copy")) {
            textArea.copy();
        } else if (st.equals("Paste")) {
            textArea.paste();
        } else if (st.equals("Exit")) {
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        }


    }
}
