package GUI;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private int width;
    private int height;

    private StartPanel startPanel;

    public Window(int width, int height){
        this.width = width;
        this.height = height;
        initializeGUI();
        initializePanels();
    }

    private void initializeGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(width, height));
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
        setResizable(false);
    }

    private void initializePanels(){
        startPanel = new StartPanel();
        add(startPanel);
        setVisible(true);
        pack();
        repaint();
    }

}
