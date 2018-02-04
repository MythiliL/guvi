import java.io.*;
import java.util.*;
class Positive
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i>0)
        {
            System.out.print("positive");
        }
        else if(i<0)
        {
            System.out.print("negative");
        }
        else
        System.out.print("zero");
    }
    
}
