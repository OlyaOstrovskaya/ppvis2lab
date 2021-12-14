package UI;

import Model.Album;
import Model.Category;
import Model.Video;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame
{

    private JPanel panel1;
    private JButton AddAlbumButton;
    private JButton AddCategoryButton;
    private JButton AddCharacter;
    private JButton FindButton;
    private JButton CloseButton;

    private PlayerWindow player_window;

    public MainWindow()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setContentPane(panel1);
        this.player_window = new PlayerWindow(this);
        CloseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        FindButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player_window.setVisible(true);
                setVisible(false);
            }
        });
    }

    public boolean addVideo(Video video) { return true; }
    public boolean addCategory(Category category) { return true; }
    public boolean addAlbum(Album album) { return true; }
    public boolean addActivePerson(Character character) { return true; }
    public boolean delVideo(Video video) { return true; }
    public boolean delCategory(Category category) { return true; }
    public boolean delAlbum(Album album) { return true; }
    public boolean delActivePerson(Character character) { return true; }
    public boolean sortByAlbum(Album album) { return true; }
    public boolean sortByActivePerson(Character character) { return true; }
    public boolean editVideo(Video video) { return true; }
    public boolean editCategory(Category category) { return true; }
    public boolean editAlbum(Album album) { return true; }
    public boolean editActivePerson(Character character) { return true; }

}
