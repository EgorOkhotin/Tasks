public class Task4 {
    public void Run(String s1, String s2)
    {
        if(Compare(s1,s2)) System.out.print("YES");
        else System.out.print("NO");
    }

    private boolean Compare(String s1, String s2)
    {
        if(s1.length() == s2.length())
        {
            for(int i=0; i<s1.length(); i++)
            {
                if(s1.charAt(i) != s2.charAt(i)) return false;
            }
        }
        else return false;
        return true;
    }
}
