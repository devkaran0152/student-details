import java.util.Scanner;
public class LearnOperator
{
public static void main(String args[])
{
Scanner src = new Scanner(System.in);
System.out.println("Enter the no you want to solve:-");
System.out.print("Enter your first no:-");
int a=src.nextInt();
System.out.print("Enter your second no:-");
int b=src.nextInt();
int c=a+b;
int d=a-b;
int e=a%b;
int f=a/b;
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
}
}


