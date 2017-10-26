import java.util.ArrayList;

public class Task13 {
    public void Run()
    {
        ArrayList<Integer> integers = new ArrayList<>();
        int a = 0;
        for(int i=100; i<1000; i++)
        {
            a = i*i*i;
            if(i== a%100) integers.add(i);
        }
    }
}
