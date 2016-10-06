/**
 * 
 * Date created 9-10-14
 * Last edited 9-11-14
 * @author Stephen Rhoades
 *
 */
public class OneTimePadEncryption {
	
	public static void main( String [] args )
	{
		
		String message   =   "Purple Dragon calling Yellow Moose";
		String one_time_pad = createKey( message) ;
		System.out.println("one time pad =>  \"" + one_time_pad + "\"");
		String coded_message = oneTimePad(message, one_time_pad);
		System.out.println("coded message => \"" + coded_message + "\"");
		String answer = oneTimePadDecrypt(coded_message, one_time_pad);
		System.out.println("message =>       \"" + answer + "\"");
	}
	
	public static String createKey( String message)
	{
		String key = "";
		for (int x = 0; x < message.length(); x++)
		{
			char z;
			if ( message.charAt(x) == ' ' )
			{
				z = ' ';
			}
			else
			{
				int random = (int)(Math.random() * 26);
				z = (char)(random + 'a');
			}
			key += z;
		}
		
		return key;
	}
	
	public static String oneTimePad( String message, String pad)
	{
		
		String answer = "";
		for (int x = 0; x < message.length(); x++ )
		{
			char z;
			char a = message.charAt(x);
			char b = pad.charAt(x);
			int shift = b - 'a';
			if (a == ' ')
			{
				z = ' ';
			}
			else if (( a + shift > 'z' && a <= 'z')||
					( a + shift > 'Z' && a <= 'Z'))
			{
				a = (char)(a - 26);
				z = (char)(a + shift);
			}
			else
			{
				z =(char)(a + shift);
			}
			answer += z;
		}
		return answer;
	
	}
	
	public static String oneTimePadDecrypt( String message, String pad)
	{
		
		String answer = "";
		for (int x = 0; x < message.length(); x++ )
		{
			char z;
			char a = message.charAt(x);
			char b = pad.charAt(x);
			int shift = b - 'a';
			if (a == ' ')
			{
				z = ' ';
			}
			else if (( a - shift < 'a' && a >= 'a')||
					( a - shift < 'A' && a >= 'A'))
			{
				a = (char)(a + 26);
				z = (char)(a - shift);
			}
			else
			{
				z =(char)(a - shift);
			}
			answer += z;
		}
		return answer;
	
	}
}
