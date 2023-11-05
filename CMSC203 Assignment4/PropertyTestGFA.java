import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestGFA {

	Property prop;

	@BeforeEach
	void setUp() throws Exception
	{
	prop = new Property("Garden Square", "Bethesda", 3550.0, "M&T Bank");
	}
	@AfterEach
	void tearDown() throws Exception
	{

	}

	@Test
	void testGetPropertyName()
	{
	assertEquals("Garden Square",prop.getPropertyName());
	}

	@Test
	void testGetCity()
	{
	assertEquals("Bethesda",prop.getCity());
	}

	@Test
	void testGetOwner()
	{
	assertEquals("M&T Bank", prop.getOwner());
	}


	@Test
	void testGetRentAmount()
	{
	assertEquals(3550.0,prop.getRentAmount());
	}

	@Test
	void testGetPlot()
	{
	assertEquals(0,prop.getPlot().getX());
	assertEquals(0,prop.getPlot().getY());
	assertEquals(1,prop.getPlot().getWidth());
	assertEquals(1,prop.getPlot().getDepth());
	}

	@Test
	void testToString()
	{
	assertEquals("Garden Square,Bethesda,M&T Bank,3550.0",prop.toString());
	}

	}
