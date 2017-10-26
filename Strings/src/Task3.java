public class Task3 {
    public void Run()
    {

    }

    public char changeRegistr(char c)
    {
        if((c>='a')&(c<='z'))
        {
            return (char)(c-32);
        }
        else if ((c>='A')&(c<='Z'))
        {
            return (char)(c+32);
        }
        else return c;
    }
}
