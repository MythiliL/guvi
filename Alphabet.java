import java.io.*;
import java.util.Scanner;
public class Alphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
ch=sc.next().charAt(0);
System.out.print("enter an character:");
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.print("entered character "+ch+" is alphabet");
else
System.out.print("not a alphabet");
}
}
