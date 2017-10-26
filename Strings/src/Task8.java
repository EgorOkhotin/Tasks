import java.util.Scanner;

public class Task8 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        String s = getLine(scan);
        System.out.print(getSign(s));
    }

    private String getLine(Scanner scan)
    {
        return scan.nextLine();
    }

    private char getSign(String s)
    {
        for(int i=0; i<s.length(); i++)
        {
            for(int j =i; j<s.length(); j++)
            {
                if(s.charAt(i)==s.charAt(j)) return s.charAt(i);
            }
        }
        return 0;
    }



}
