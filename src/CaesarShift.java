/**
 * 
 * Date created 9-11-14
 * Last edited 9-12-14
 * @author Stephen Rhoades
 *
 */
public class CaesarShift {
	
	public static void main ( String [] args )
	{
		int shift = 1;
		String message = "a";
		String coded_message = caesarShift (message, shift);
		System.out.println(coded_message);
		String answer = caesarDecode(coded_message, shift);
		System.out.println(answer);
	}
	
	public static String caesarShift( String message, int shift)
	{
		String answer = "";
		shift = shift % 26; 
		for ( int x = 0; x < message.length(); x++)
		{
			char a = message.charAt(x);
			char z = '!';
			if ( (a > 'z') || (a < 'A') || ( a > 'Z' && a < 'a' ) )
			{
				z = a;
			}
			else if ( (a + shift > 'Z' && a <= 'Z' ) ||
					( a + shift > 'z' && a <= 'z') )
			{
				a -= 26;
				z = (char)(a + shift);
			}
			else
			{
				z = (char)(a + shift);
			}
			answer += z;
		}
		return answer;
	}
	
	public static String caesarDecode( String message, int shift)
	{
		String answer = "";
		shift = shift % 26; 
		for ( int x = 0; x < message.length(); x++)
		{
			char a = message.charAt(x);
			char z = '!';
			if ( (a > 'z') || (a < 'A') || ( a > 'Z' && a < 'a' ) )
			{
				z = a;
			}
			else if ( (a - shift > 'Z' && a <= 'Z' ) ||
					( a - shift > 'z' && a <= 'z') )
			{
				a -= 26;
				z = (char)(a - shift);
			}
			else if ( (a - shift < 'A' && a >= 'A' ) ||
					( a - shift < 'a' && a >= 'a') )
			{
				a += 26;
				z = (char)(a - shift);
			}
			else
			{
				z = (char)(a - shift);
			}
			answer += z;
		}
		return answer;
	}

}
