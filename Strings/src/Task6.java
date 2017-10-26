import java.util.Scanner;

public class Task6 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        String s = getLine(scan);
        System.out.print(getLongestWord(s));
    }

    private String getLine(Scanner scan)
    {
        return scan.nextLine();
    }
    private String getLongestWord(String s)
    {
        String[] array = s.split(" ");
        int k =0, max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++)
        {
            array[i].replace(" ","");
            if(array[i].length() > max)
            {
                max = array[i].length();
                k = i;
            }
        }
        return array[k];
    }
}
