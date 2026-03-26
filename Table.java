import java.util.Scanner;
public class Table
{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
System.out.println("Please enter the no you want the table for:-");
int num=src.nextInt();
int i=1;
while(i<=10)
{
int j=(i*num);
System.out.println(j);
i++;
}
}
}