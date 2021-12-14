package Model;

import java.util.ArrayList;

public class Album
{
    public String login;
    public String password;

    private ArrayList<Video> videos;

    public boolean openAlbum(String password) { return this.password.equals(password); }
    public boolean addVideo(Video video)
    {
        this.videos.add(video);
        return true;
    }
    public boolean deleteVideo(Video video) { return true; }
    public boolean changeLogin(String login)
    {
        this.login = login;
        return true;
    }
    public boolean changePassword(String password)
    {
        this.login = password;
        return true;
    }
}
