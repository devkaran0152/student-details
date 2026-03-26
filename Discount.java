import java.util.Scanner;
public class Discount
{
public static void main(String args[])
{
Scanner src = new Scanner(System.in);
System.out.println("Welcome to SpiceJet");
System.out.println("Discount of 15% will be given to senior citizen:-");
System.out.println("Price of ticket is= 20000/");
System.out.println("Enter your age:-");
int age=src.nextInt();
int ticketPrice=20000;
if(age>=50)
{
float discount=(15.0f/100) * ticketPrice;
System.out.println("The ticket price after discount is "+discount);
double finalPrice=(double)ticketPrice-discount;
System.out.println("Final price for senior citizen is:- "+finalPrice);
}
else
{
System.out.println("No discount for you Sorry!");
}
}
}