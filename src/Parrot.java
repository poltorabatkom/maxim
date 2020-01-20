import java.io.*;

public class Parrot
{
    //переменная хранит последнюю фразу
    private static String Speak;

    //
    public Parrot()
    {
        Speak = "Sqwar";
    }

    //
    public void speak()
    {
        System.out.println(Speak);
    }

    //
    public void teach(String Text)
    {
        Speak = Text;
    }

}
