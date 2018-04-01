package strings;




public class DisplayRepeatingLetters {
	
	public static void RepeatString()
	{
		String txt1 ="data";
		char[] stringChar = txt1.toCharArray();
		
		for (int i = 0; i < stringChar.length; i++) 
		{
			for (int j = i+1; j < stringChar.length; j++)
			{
				
					if(stringChar[i]==stringChar[j])
					{
						
						System.out.println(stringChar[i]);
						break;
					}
				
					
			}
		}
		
		
	}

	public static void main(String[] args)
	{
		DisplayRepeatingLetters test = new DisplayRepeatingLetters();
		test.RepeatString();
		
		
	}

}
