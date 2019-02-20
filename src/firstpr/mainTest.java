package firstpr;

import static org.junit.Assert.*;
import org.junit.Test;

public class mainTest {

	@Test
	public void testnewcart() throws Exception 
	
	{
		main a= new main();
		int val = a.cartval();
		assertEquals(0,val);
			 
	}
	@Test
	public void testaddbook()
	{
		main b = new main() ;
		b.insertbook(1,127);
		int val1 = b.cartval();
		int book=b.cartbook();
		assertEquals(127,val1);
		assertEquals(1,book);
		
	}
	
	@Test
	public void testdifferentbookforbook()
	{
		main c = new main();
		c.insertbook(1,127)	;
		c.insertbook(1,100);
		//int val2 = c.cartval();
		int book= c.cartbook();
		assertEquals(2,book);
	   // assertEquals(227,val2);
	}
	@Test
	public void testdifferentbookforval()
	{
		main c = new main();
		c.insertbook(1,127)	;
		c.insertbook(1,100);
		int val2 = c.cartval();
		//int book= c.cartbook();
		//assertEquals(2,book);
		assertEquals(227,val2);
	}
	

}
