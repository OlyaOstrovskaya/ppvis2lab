package UI;

import Model.Album;
import Model.Category;
import Model.Video;
import Model.VideoLibrary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterWindow extends JFrame
{
    private VideoLibrary library;
    private JPanel panel1;
    private JButton AcceptButton;
    private JButton CloseButton;
    private JTextField PasswordText;
    private JTextField LoginText;
    private JTextField InputPasswordField;
    private JTextField InputLoginField;

    public RegisterWindow()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setContentPane(panel1);
        CloseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        AcceptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow window = new MainWindow();
                window.setVisible(true);
                dispose();
            }
        });
    }

    public boolean register() { return true; }
    public boolean login() { return  true; }
}
