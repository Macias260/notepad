package Macias260.notepad;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Data
public class Menu extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu1;
    private JMenu menu2;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenuItem menuItem7;
    private JMenuItem menuItemClose;

    public Menu() throws HeadlessException {

//        Create a menu bar
        menuBar = new JMenuBar();

//        Create a File menu
        menu1 = new JMenu("File");

//        Create File menu items
        menuItem1 = new JMenuItem("New");
        menuItem2 = new JMenuItem("Open");
        menuItem3 = new JMenuItem("Save");
        menuItem4 = new JMenuItem("Print");

//        Add action listener
        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);
        menuItem4.addActionListener(this);

        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);
        menu1.add(menuItem4);

//        Create a Edit menu
        menu2 = new JMenu("Edit");

//        Create Edit menu items
        menuItem5 = new JMenuItem("Cut");
        menuItem6 = new JMenuItem("Copy");
        menuItem7 = new JMenuItem("Paste");
//        Add action listener
        menuItem5.addActionListener(this);
        menuItem6.addActionListener(this);
        menuItem7.addActionListener(this);

        menu2.add(menuItem5);
        menu2.add(menuItem6);
        menu2.add(menuItem7);

//        Create close item
        menuItemClose = new JMenuItem("Close");
//        Add action listener
        menuItemClose.addActionListener(this);

//        Add menus to menu bar
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menuItemClose);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
