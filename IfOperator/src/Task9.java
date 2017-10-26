public class Task9 {
    public void Run(int n)
    {

        int count1=0,count2=0,count3=0;
        while(n > 0)
        {
            if(n>34) // значение на котором выгодно покупать(нижняя граница)
            {
                count3++;
                n -= 60;
            }
            else if(n > 8)
            {
                count2++;
                n -=10;
            }
            else
            {
                count1 = n;
                n = 0;
            }
        }

        System.out.print(count1 + " " + count2 + " " + count3);

    }
}
