import java.util.Scanner;

public class Task1 {
    public int Run()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        for(int i=0; i<n; i++)
        {
            if(a[i]==x) return i;
        }
        return -1;
    }
}
