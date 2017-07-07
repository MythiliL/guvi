import java.util.*;
class TimeReapeat
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int temp=0;
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                   // temp+=1;
                }
            }
        }
        //System.out.print(temp);
    }
}


