import java.util.Scanner;
class passFail
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = sc.nextInt();
		System.out.println("Enter the Total marks :");
		int totalMarks = sc.nextInt();
		
		double percentage = (marks *100) / totalMarks;
		String op = (percentage >= 35 )?
			((percentage >= 75)?("grade A"):("grade B")):("Fail");
		System.out.println(percentage +"% " + op);
		
	}
		
}