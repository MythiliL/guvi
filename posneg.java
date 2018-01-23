import java.io.*;
import java.util.*;
class posneg
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a<=0 && a>=100000)
        System.out.print("num is not in range");
    else if(a>0)
        System.out.print("num is positive");
    else if(a==0)
        System.out.print("num is zero");
    else
        System.out.print("num is negative");
    }
}
