import.java.io.*;
import java.util.Scanner;
public class Const
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
ch=sc.next().charAt(0);
System.out.print("enter an character:");
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='O'||ch=='E'||ch=='I'||ch=='U')
{
System.out.print("entered character "+ch+" is vowel");
}
else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.print("entered character "+ch+" is consonant");
else
System.out.print("not a alphabet");
}
}
