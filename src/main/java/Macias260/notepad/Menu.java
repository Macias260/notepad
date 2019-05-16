package Macias260.notepad;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

@EqualsAndHashCode(callSuper = true)
@Data
public class Menu extends JFrame {
    @Getter(AccessLevel.NONE)
    JMenuBar menuBar;
    JMenu menu1;
    JMenu menu2;
    JMenuItem menuItem1;
    JMenuItem menuItem2;
    JMenuItem menuItem3;
    JMenuItem menuItem4;
    JMenuItem menuItem5;
    JMenuItem menuItem6;
    JMenuItem menuItem7;
    JMenuItem menuItem8;


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
        menuItem8 = new JMenuItem("Exit");

//        Add items to File menu
        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);
        menu1.add(menuItem4);
        menu1.add(menuItem8);

//        Create a Edit menu
        menu2 = new JMenu("Edit");

//        Create Edit menu items
        menuItem5 = new JMenuItem("Cut");
        menuItem6 = new JMenuItem("Copy");
        menuItem7 = new JMenuItem("Paste");

//        Add items to Edit menu
        menu2.add(menuItem5);
        menu2.add(menuItem6);
        menu2.add(menuItem7);

//        Add menus to menu bar
        menuBar.add(menu1);
        menuBar.add(menu2);


    }


}
