import java.util.Scanner;
public class swap 
{
public static void main(String args[])
{
	Scanner src= new Scanner(System.in);
System.out.print("Enter first no:-");
int a=src.nextInt();
System.out.print("Enter second number:-");
int b=src.nextInt();
int c=a;
a=b;
b=c;
System.out.println("Value of a is " +a);
System.out.println("Value of b is " +b);
}
}
