class Loop1
{	
	public static void main(String[] args)
	{
		for (int i = 1 ;i <= 10 ;i++ )
		{
			System.out.print(i+" ");
		}
		
		System.out.println("character A to Z");
		for (char ch = 'A';ch <= 'Z' ;ch++ )
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		for (char ch = 'Z';ch >= 'A' ;ch-- )
		{
			System.out.print(ch+" ");
		}
		
		for (char ch = 'a';ch <= 'z' ;ch++ )
		{
			System.out.print(ch+" ");
		}
	}
}