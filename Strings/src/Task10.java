import java.util.Scanner;

public class Task10 {
    private int x = 0, y =0;
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        String s = getLine(scan);
        calcCoordinates(s);
        s = getLine(scan);
        calcCoordinates(s);
        s = getLine(scan);
        calcCoordinates(s);
        System.out.print(x + " " + y);
    }
    private String getLine(Scanner scan)
    {
        return scan.nextLine();
    }

    private void calcCoordinates(String s)
    {
        String[] arr = s.split(" ");
        switch (arr[0])
        {
            case "North": x += Integer.parseInt(arr[1]);
                            break;
            case "South": x-=Integer.parseInt(arr[1]);
                            break;
            case "East" : y+=Integer.parseInt(arr[1]);
                            break;
            case "West" : y-=Integer.parseInt(arr[1]);
                            break;
        }
    }


}
