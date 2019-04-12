package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel {
    private JTextField txtUsername;
    private JButton btnLogIn;


    public StartPanel(){
        setLayout(new GridBagLayout());
        initializeComponents();
        registerListeners();
    }

    private void initializeComponents(){
        txtUsername = new JTextField("Username");
        btnLogIn = new JButton("Connect");

        txtUsername.setPreferredSize(new Dimension(200, 40));
        btnLogIn.setPreferredSize(new Dimension(120, 70));

        GridBagConstraints gbcUsername = new GridBagConstraints();
        gbcUsername.fill = GridBagConstraints.VERTICAL;
        gbcUsername.gridx = 0;
        gbcUsername.gridy = 0;

        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.fill = GridBagConstraints.VERTICAL;
        gbcButton.gridx = 0;
        gbcButton.gridy = 2;
        gbcButton.insets = new Insets(20, 0, 0 ,0);

        setBackground(Color.LIGHT_GRAY);
        add(txtUsername, gbcUsername);
        add(btnLogIn, gbcButton);

    }

    private void registerListeners(){

    }

    private class ButtonLogInListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
}
