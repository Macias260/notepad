package Macias260.notepad;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.swing.*;
import java.awt.*;

@EqualsAndHashCode(callSuper = true)
@Data
public class Frame extends JFrame {
    JFrame jFrame;
    Menu menu;

    public Frame() throws HeadlessException {
        jFrame = new JFrame("Notepad");
        menu = new Menu();

        jFrame.setJMenuBar(menu.menuBar);
        jFrame.setSize(800, 500);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.setVisible(true);


    }
}
