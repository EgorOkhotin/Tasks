public class Task1 {
    public void Run(char c)
    {
        System.out.print(isDigit(c));
    }

    private boolean isDigit(char c)
    {
        if((c>=48)&(c<=57)) return true;
        else return false;
    }
}
