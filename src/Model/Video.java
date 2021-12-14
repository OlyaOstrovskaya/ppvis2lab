package Model;

import java.util.ArrayList;

public class Video
{
    public String name;
    public String path;
    public String description;

    public ArrayList<Category> categories;
    public ArrayList<Character> characters;

    public boolean deleteVideo(Video video) { return true; }
    public boolean changeDescription(String description)
    {
        this.description = description;
        return true;
    }
    public boolean changeName(String name)
    {
        this.name = name;
        return true;
    }
    public boolean changePath(String path)
    {
        this.path = path;
        return true;
    }
    public boolean changeCategory(ArrayList<Category> categories)
    {
        this.categories = categories;
        return true;
    }
}
