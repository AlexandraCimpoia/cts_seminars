package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.Person;

public class TestPersonCalcAvgCost {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// CORRECT
	@Test
	public void testConformance() throws Exception {
		// correct format/is the value valid?
		int costs[] = { 20, 30, 10, 70, 95, 100 };
		Person pers = new Person();
		pers.setCostReceipts(costs);
		double result = pers.calculateAvgCosts();
		double expected = 54.16; // 54.(6)
		assertEquals(expected, result, 0.2);
	}

	@Test
	public void testOrdering() throws Exception {
		// the set of values must be ordered or not?
		int[] costs = { 100, 70, 20, 10, 95, 30 };
		Person pers = new Person();
		pers.setCostReceipts(costs);
		double result = pers.calculateAvgCosts();
		double expected = 54.16; // 54.(6)
		assertEquals(expected, result, 0.2);// checking the results, not the format
	}

	@Test
	public void testRangeResult() throws Exception {
		// is the value between acceptable limits(max and min)?
		int[] costs = { 100, 70, 20, 10, 95, 30 };
		Person pers = new Person();
		pers.setCostReceipts(costs);
		double result = pers.calculateAvgCosts();
		// double expected = 54.16; //54.(6)
		assertTrue((result >= 0 && result <= 200));
	}

	@Test(expected = Exception.class)
	public void testRangeInput() throws Exception {
		// is the value between acceptable limits(max and min)?
		int[] costs = { 100, -70, 20, 10, 95, 30 };
		Person pers = new Person();
		pers.setCostReceipts(costs);
		double result = pers.calculateAvgCosts();
	}

	@Test
	public void testRangeInput2() throws Exception {
		// is the value between acceptable limits(max and min)?
		int[] costs = { 100, -70, 20, 10, 95, 30 };
		Person pers = new Person();
		pers.setCostReceipts(costs);
		try {
			pers.calculateAvgCosts();
			fail("range input test not throwing exception");
		} catch (Exception e) {
			// e.printStackTrace();
			assertTrue(true); // im expecting to get an exception
		}
	}
	
	@Test(expected = Exception.class)
	public void testExistance() throws Exception {
		// does the value exist?
		int[] costs = {};
		Person pers = new Person();
		pers.setCostReceipts(costs); 
		pers.calculateAvgCosts();//expect error
	}
	
	@Test
	public void testCardinality() throws Exception {
		// does the set of values have enough values?
		//1 value
		int[] costs = {90};
		Person pers = new Person();
		pers.setCostReceipts(costs); 
		pers.calculateAvgCosts();//not expecting errors
		assertEquals(1, pers.getCostReceipts().length);
	}
}
