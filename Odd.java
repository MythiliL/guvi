import java.io.*;
import java.util.*;
class Odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%2==0)
        {
            System.out.print("even");
        }
        else
        {
            System.out.print("odd");
        }
    }
}
