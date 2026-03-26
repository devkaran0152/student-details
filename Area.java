import java.util.Scanner;
public class Area
{
public static void main(String args[])
{
Scanner src = new Scanner(System.in);
System.out.println("Enter the no you want to calculate interest for:-");
System.out.print("Enter your principal no:-");
int p=src.nextInt();
System.out.print("Enter your rate:- ");
int r=src.nextInt();
System.out.print("Enter your time:- ");
int t=src.nextInt();
double interest=(p*r*t)/100;
System.out.println("The interest is= "+interest);
}
}
