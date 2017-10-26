public class Task8 {
    public static void Run(int a, int b, int c)
    {
        if((a+b)>c & (a+c)>b & (c+b)>a)
        {
            double gamma = Math.acos((double)(a*a+b*b-c*c)/ (double)(2*a*b));
            double beta = Math.acos((double)(a*a+c*c-b*b)/ (double)(2*a*c));
            double alpha = 180-gamma-beta;
            if(alpha>=beta)
            {
                if(alpha>=gamma)
                {
                    if(alpha<90) System.out.print("Acute");
                    else if(alpha>90) System.out.print("Obtuse");
                    else System.out.print("Rectangle");
                }
                else
                {
                    if(gamma<90) System.out.print("Acute");
                    else if(gamma>90) System.out.print("Obtuse");
                    else System.out.print("Rectangle");
                }
            }
            else
            {
                if(beta>=gamma)
                {
                    if(beta<90) System.out.print("Acute");
                    else if(beta>90) System.out.print("Obtuse");
                    else System.out.print("Rectangle");
                }
                else
                {
                    if(gamma<90) System.out.print("Acute");
                    else if(gamma>90) System.out.print("Obtuse");
                    else System.out.print("Rectangle");
                }
            }
        }
        else System.out.print("Impossible");
    }
}
