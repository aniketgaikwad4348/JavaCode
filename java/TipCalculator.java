import java.util.Scanner;
class TipCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bill : " );
		
		float bill = sc.nextFloat();
		
		System.out.println("Enter the Tip Rate : ");
		float tipRate = sc.nextFloat();
		
		float TipAmount = (bill * tipRate) / 100 ;
		float totalBill = bill + TipAmount ;
		
		System.out.println("Tottal Bill Amount : " + totalBill);
		System.out.println("TipAmount added is : " + TipAmount);
	}
		
		
}