import java.util.Scanner;
class hiTwoHiFive
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		String op = ((num % 2 == 0 && num % 5 == 0)?(num + " HiTwoHiFive"):
			((num % 2 == 0 )?(num +" HiTwo"):
			((num % 5 == 0)?(num +" HiFive"):("")))); 
		System.out.println("Enter the number : "+op);
	}
}