import static org.junit.Assert.*;

import org.junit.Test;


public class EncrpytionTests {

//	@Test
//	public void testSubstitution() {
//		
//	}
	
	@Test
	public void testCaesarShift() {
		System.out.println(CaesarShift.caesarShift( "a", 1));
		assertEquals("b", CaesarShift.caesarShift( "a", 1));
	}

}
