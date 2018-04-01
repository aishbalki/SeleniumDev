package strings;

public class NextLetter {

	public static void main(String[] args) {
		
		String txt="abcd";
		
		
		
		for (int i = 0; i < txt.length(); i++) 
		
		{
			int k=(int)txt.charAt(i)+1;
			
			System.out.print((char)k);
			
		}

	}

}
