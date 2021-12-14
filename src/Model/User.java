package Model;

public class User
{
    public String login;
    public String password;

    public boolean changeLogin(String login)
    {
        this.login = login;
        return true;
    }
    public boolean changePassword(String password)
    {
        this.password = password;
        return true;
    }
}
