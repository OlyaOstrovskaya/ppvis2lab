package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerWindow extends JFrame
{
    private PlayerController controller;
    private JPanel panel1;
    private JButton AddToFavoriteButton;
    private JButton DeleteButton;
    private JButton EditButton;
    private JButton CloseButton;

    private MainWindow main_window;

    public PlayerWindow(MainWindow main_window)
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setContentPane(panel1);
        CloseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main_window.setVisible(true);
                setVisible(false);
            }
        });
        EditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        DeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        AddToFavoriteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void startVideo() {}
}
