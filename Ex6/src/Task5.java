import java.util.Scanner;

public class Task5 {
    public void Run()
    {
        int[] controlArray = new int[9];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = scan.nextInt();
            controlArray[array[i]-1]++;
        }

        for(int i=0; i<9; i++)
        {
            System.out.print(controlArray[i]+ " ");
        }

    }
}
