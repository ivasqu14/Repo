
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a Plot object.
 * 
 * @author Farnaz Eivazi
 * @version 7/11/2022
 * 
 */
public class PlotTestGFA {
	private Plot plot1, plot2, plot3, plot4;

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(2, 2, 6, 6);
		plot2 = new Plot(3, 4, 4, 3);
		
		plot3 = new Plot(11, 11, 3, 2);
		plot4 = new Plot(11, 14, 2, 1);
	}

	@After
	public void tearDown() throws Exception {
		plot1 = plot2 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot2)); 
		assertTrue(plot3.overlaps(plot4));
	}
	
	@Test
	public void testEncompasses()
	{
		assertTrue(plot1.encompasses(plot1));
		assertFalse(plot3.encompasses(plot3));
	}
	
	@Test 
	public void testGetX()
	{
		assertEquals(3,plot2.getX());
	}
	
	@Test
	public void testGetY()
	{
		assertEquals(4, plot2.getY());
	}
	
	@Test
	public void testGetWidth()
	{
		assertEquals(4, plot2.getWidth());
	}
	
	@Test
	public void testGetDepth()
	{
		assertEquals(3, plot2.getDepth());
	}
	
	@Test
	public void testToString() {
		assertEquals("3,4,4,3",plot2.toString());	
	}

}
