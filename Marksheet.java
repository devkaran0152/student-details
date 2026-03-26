import java.util.Scanner;
class Marksheet
{
	
			public void checkPercentage( double percentage)
			 {
			 if(percentage>=80)
			{
			System.out.println("Passed with A grade");
			}
			else if(percentage>=60)
			{
			System.out.println("Passed with B grade");
			}
			else if(percentage>=40)
			{
			System.out.println("Passed with C grade");
			}
			else
			{
			System.out.println("!! Sorry Your chid is not eligible to increment next class !!");
			}
			 }


			public static void main(String args[])
			{
			Scanner src=new Scanner(System.in);
			System.out.println("Input the marks you got in English");
			double eng=src.nextDouble();
			System.out.println("Input the marks you got in Hindi");
			double hin=src.nextDouble();
			System.out.println("Input the marks you got in Mathematics");
			double math=src.nextDouble();
			System.out.println("Input the marks you got in Science");
			double sci=src.nextDouble();
			System.out.println("Input the marks you got in Phsyical");
			double phy=src.nextDouble();
			 double percen=((eng+hin+math+sci+phy)/500.0)*100.0;
			 Marksheet obj=new Marksheet();
			 obj.checkPercentage(  percen);
			}
}
			 






