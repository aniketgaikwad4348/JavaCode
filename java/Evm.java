import java.util.Scanner;
class Evm
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int bjp = 0, cng = 0, aap = 0, ss = 0, mns = 0, nota = 0;
		
		System.out.println();
		System.out.println("        WELCOME         ");
		System.out.println(" Enter the Populations : ");
		int pop = sc.nextInt();
		
		for (int i = 1; i <= pop ; i++ )
		{
			System.out.println("********LIST OF PARTIES ************");
			System.out.println("1. BJP"); 
			System.out.println("2. CONGRESS");
			System.out.println("3. AAP");
			System.out.println("4. SHIV SENA");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
		
			System.out.println("Enter the Your voting party number : ");
			int vote = sc.nextInt();
			
		
		if (vote >= 1 && vote <= 6)
		{
			if (vote == 1)
			{
				bjp++;
				System.out.println("AACHHE DIN AAYEGE");
			}
			if (vote == 2)
			{
				cng++;
				System.out.println("BHARAT JODO");
			}
			if (vote == 3)
			{
				aap++;
				System.out.println("MUZE AAZAD KARDO");
			}
			if (vote == 4)
			{
				ss++;
				System.out.println("HAM HAI AASALI SENA");
			}
			if (vote == 5)
			{
				mns++;
				System.out.println("JAY MAHARASHTRA");
			}
			if (vote == 6)
			{
				nota++;
				System.out.println("YOU ARE THE EDUCATED PERSON");
			}
			if(!(vote>=1&&vote<=6)){
			i--;
			System.out.println("Invalid option");
			}
		
			if(bjp > cng && bjp > aap && bjp > ss && bjp > mns && bjp > nota)
			{
				System.out.print("BJP Win by " +bjp +" votes");
				//return;
			}
			if(  cng > aap  && cng > ss && cng > mns && cng > nota)
			{
				System.out.println("Congress win by "+cng +"votes");
				//return;
			}
			if ( aap > ss && aap > mns && aap > nota)
			{
				System.out.println("AAP win by "+aap +" votes");
				//return;
			}
			if ( ss > mns && ss > nota)
			{
				System.out.println("SHIV SENA win by "+ss +" votes");
				//return;
			}
			if ( mns > nota)
			{
				System.out.println("MNS win by "+mns +" votes");
				//return;
			}
		
			
				System.out.println("No one is better for this positon ");
			
		}
		
	}
}
}		