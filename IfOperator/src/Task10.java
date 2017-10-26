public class Task10 {
    public void Run(int n)
    {

        int count0=0,count1=0,count2=0,count3=0;
        while(n > 0)
        {
            if(n>35) // значение на котором выгодно покупать(нижняя граница)
            {
                count3++;
                n -= 60;
            }
            else if(n > 17)
            {
                count2++;
                n -= 20;
            }
            else if(n>8)
            {
                count1--;
                n -= 5;
            }
            else
            {
                count0 =n;
                n=0;
            }
        }

        System.out.print(count0 + " " + count1 + " " + count2 + " " + count3);
    }
}
