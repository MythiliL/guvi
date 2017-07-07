import java.util.*;
class TimeReapeat
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int b=0;
        int a[]=new int[len];
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[i]+" ");
                   // b+=1;
                }
            }
        }
        //System.out.print(b);
    }
}


