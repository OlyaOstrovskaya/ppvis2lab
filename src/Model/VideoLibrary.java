package Model;

import java.util.ArrayList;

public class VideoLibrary
{
    public ArrayList<Album> albums;
    public ArrayList<Category> categories;
    public ArrayList<Character> characters;
    public VideoSorter video_sorter;
    public User user;

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
