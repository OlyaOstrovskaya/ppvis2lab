package Model;

public class Character
{
    public String name;
    public String desc;

    public boolean changeName(String name)
    {
        this.name = name;
        return true;
    }
    public boolean changeDesc(String desc)
    {
        this.desc = desc;
        return true;
    }

}
