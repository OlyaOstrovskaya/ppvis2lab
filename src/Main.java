import UI.RegisterWindow;

public class Main
{

    public boolean start()
    {
        return true;
    }

    public boolean entry()
    {
        return true;
    }

    public static void main(String[] args)
    {
        RegisterWindow registerWindow = new RegisterWindow();
        registerWindow.setVisible(true);
    }
}
