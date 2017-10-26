import sun.text.normalizer.UTF16;

public class Task2 {
    public void Run()
    {

    }

    private char ToUpper(char c)
    {
        if((c>='a')&(c<='z'))
        {
            return (char)(c-32);
        }
        else return c;
    }
}
