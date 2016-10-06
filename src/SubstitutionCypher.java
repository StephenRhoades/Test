/**
 * 
 * Date created 9-12-14
 * Last edited 9-12-14
 * @author Stephen Rhoades
 *
 */
public class SubstitutionCypher {
	public static void main ( String [] args )
	{
		String key ="zxyvwasdfbqertngmhkjuiolpc";
		String message = "the hippo will fly tonight";
		String coded_message = subCypher (message, key);
		System.out.println(coded_message);
//		String answer = subDeCypher(coded_message, key);
//		System.out.println(answer);
	}
	public static String makeKey()
	{
		String answer = "";
		return answer;
	}
	
	public static String subCypher( String message, String pad)
	{
		String answer = "";
		for(int x = 0 ; x < message.length(); x++ )
		{
			char a = message.charAt(x);
			char z = '!';
			if ( (a > 'z') || (a < 'A') || ( a > 'Z' && a < 'a' ) )
			{
				z = a;
			}
			else
			{
				z = pad.charAt((int)(a-'a'));
			}
			answer += z;
		}
		return answer;
	}
	
//	public static String subDeCypher( String message, String pad)
//	{
//		String answer = "";
//		shift = shift % 26; 
//		for ( int x = 0; x < message.length(); x++)
//		{
//			
//			else if ( (a - shift > 'Z' && a <= 'Z' ) ||
//					( a - shift > 'z' && a <= 'z') )
//			{
//				a -= 26;
//				z = (char)(a - shift);
//			}
//			else if ( (a - shift < 'A' && a >= 'A' ) ||
//					( a - shift < 'a' && a >= 'a') )
//			{
//				a += 26;
//				z = (char)(a - shift);
//			}
//			else
//			{
//				z = (char)(a - shift);
//			}
//			answer += z;
//		}
//		return answer;
//	}


}
