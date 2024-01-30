/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et.com.inhousetraining.L12.gui.training;

import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;

public class PopupMenu {

    private JPopupMenu menu;
    private Toolkit toolkit;

    public PopupMenu() {
        
        JFrame frame = new JFrame("Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        toolkit = frame.getToolkit();
        
        menu = new JPopupMenu();
        
        JMenuItem menuItemBeep = new JMenuItem("Beep");
        menuItemBeep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                toolkit.beep();
            }
        });
        
        menu.add(menuItemBeep);

        JMenuItem menuItemClose = new JMenuItem("Close");
        menuItemClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(menuItemClose);
        
        
        frame.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == e.BUTTON2) {
                    menu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        
        frame.setSize(250, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenu();
    }
}