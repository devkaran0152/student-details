import java.util.Scanner;
class Interest
{
double calcProfit(int sp, int cp)
{

double profit=sp-cp;
return (profit/cp)*100;
}

double calcLoss(int sp,int cp)
{
double loss=cp-sp;
return (loss/cp)*100;
}
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
System.out.println("Enter the selling price:- ");
int sellPrice=src.nextInt();
System.out.println("Enter the cost price:- ");
int costPrice=src.nextInt();
Interest obj=new Interest();


if(sellPrice>costPrice)
{
double result=obj.calcProfit(sellPrice,costPrice);
System.out.println(result);
}
else
{
double result=obj.calcLoss(sellPrice,costPrice);
System.out.println(result);
}
}
}



