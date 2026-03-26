
import java.util.Scanner;
class SimpleInterest
{
double calcSI(double p,double r, double t)
{
return (p*r*t)/100.0;
}

public static void main(String args[])
{
Scanner src=new Scanner(System.in);
System.out.println("Enter the principal value:-");
double principal=src.nextDouble();
System.out.println("Enter the rate value:-");
double rate=src.nextDouble();
System.out.println("Enter the time value:-");
double time=src.nextDouble();
SimpleInterest obj=new SimpleInterest();
double totalValue=obj.calcSI(principal,rate,time);
System.out.println("The total interest:- "+totalValue);
}
}
