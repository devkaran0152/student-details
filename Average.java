import java.util.Scanner;
class Average
{
double average(int a, int b, int c)
{
double d=(a+b+c)/3.0;
return d;
}
public static void main(String args[])
{
Scanner src = new Scanner(System.in);
System.out.println("Enter first number:- ");
int x=src.nextInt();
System.out.println("Enter second number:- ");
int y=src.nextInt();
System.out.println("Enter third number:- ");
int z=src.nextInt();
Average obj=new Average();
int totalAverage=obj.average(x,y,z);
System.out.println("The average of three values:= "+ totalAverage);
}
}