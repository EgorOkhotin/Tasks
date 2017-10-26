import java.util.Scanner;

public class Task7 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        String s = getLine(scan);
        if(isPolindrom(s)) System.out.print("YES");
        else System.out.print("NO");
    }

    private String getLine(Scanner scan)
    {
        return scan.nextLine();
    }

    private boolean isPolindrom(String s)
    {
        for(int i=0,j=s.length()-1; i<=j;i++,j--)
            if(s.charAt(i) != s.charAt(j)) return false;
        return true;
    }
}
