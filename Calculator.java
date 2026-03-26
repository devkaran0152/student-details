import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
System.out.println("!! Welcome to Calculator !!");
System.out.println("Please select the operation you want to perform:-");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
Scanner src= new Scanner(System.in);
System.out.println("Input the task you want to perform:-");
int option=src.nextInt();
Calculator.obj= new Calcuator();

if(option==1)
{
obj.sum();
}

if(option==2)
{
obj.diff();
}
if(option==3)
{
obj.product();
}
if(option==4)
{
obj.quo();
}
}
double sum()
{
double totalSum=a+b;
return totalSum;
}

double diff()
{
double totalDif=a-b;
return totalDif;
}

double product()
{
double totalProduct=a*b;
return totalProduct;
}

double quo()
{
double totalQuo=a/b;
return totalQuo;
}
}