import java.util.Scanner;

public class Task9 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        String s = getLine(scan);
        String s2 = getLine(scan);
        if(isContains(s,s2)) System.out.print("YES");
        else System.out.print("NO");
    }

    private String getLine(Scanner scan)
    {
        return scan.nextLine();
    }

    private boolean isContains(String s1, String s2)
    {
        if((s1.contains(s2)) | s2.contains(s1)) return true;
        return false;
    }
}
