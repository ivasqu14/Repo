import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest {

	GradeBook a;
	GradeBook b;
	@BeforeEach
	void setUp() throws Exception {
		
		a = new GradeBook(5);
		a.addScore(20.2);
		a.addScore(37.5);
		
		b = new GradeBook(5);
		b.addScore(17.5);
		b.addScore(32.2);
		
	
		
	}
	

	@AfterEach
	void tearDown() throws Exception {
		
		a = null;
		b = null;
	}

	@Test
	void testAddScore() {
		assertTrue(a.toString().equals("20.2 37.5 0.0 0.0 0.0 "));
		assertEquals(2, a.getScoreSize());
		
		assertTrue(b.toString().equals("17.5 32.2 0.0 0.0 0.0 "));
		assertEquals(2, b.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(57.7, a.sum());
		assertEquals(49.7, b.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(20.2, a.minimum());
		assertEquals(17.5, b.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(37.5, a.finalScore());
		assertEquals(32.2, b.finalScore());
	}


	

}
