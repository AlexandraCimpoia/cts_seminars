package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.ETypeMarket;
import classes.Market;
import classes.Supermarket;
import exceptions.ExceptionMarket;

public class TestSupermarketGetBiggestMarketByArea {
	
	static Market m1;	
	static Market m2;
	static Market m3;
	static Market m4;
	static Market m5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			System.out.println("setUpBeforeClass");
			
			m1 = new Market("Sephora", 20, ETypeMarket.BEAUTY);
			m2 = new Market("Douglas", 15, ETypeMarket.BEAUTY);
			m3 = new Market("Mobexpert", 40, ETypeMarket.DECORATION);
			m4 = new Market("Zara", 20, ETypeMarket.DRESS);
			m5 = new Market("HM", 20, ETypeMarket.DRESS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	//RIGHT BICEP
	@Test
	public void testRight() {
		System.out.println("Test RIGHT");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);	
		listM.add(m4);
		listM.add(m5);
		
		Supermarket sm = new Supermarket("Mall Bucharest", listM);
		
		try {
			Market result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			
			String expected = "Sephora";
			
			//more weird than the other one
			if(result.getName().equals(expected)) {
				assertTrue(true);
			}else {
				assertTrue(false);
				//fail();
			}
			
			//assertEquals(expected, result.getName());
			
		} catch (ExceptionMarket e) {
			e.printStackTrace();
			fail("I'm not expecting to fail - not ok");
		}
	}
	
	@Test
	public void testBoundary() {
		System.out.println("testBoundary");
		
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		Supermarket sm = new Supermarket("Mall Bucharest", listM);
		
		try {
			Market result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			
			assertEquals("Sephora", result.getName());
		} catch (ExceptionMarket e) {
			e.printStackTrace();
			fail("NOT OK");
			
		}
	}
	
	@Test(expected = ExceptionMarket.class)
	public void testException() throws ExceptionMarket {
		
		ArrayList<Market> listM = new ArrayList<>();
		
		Supermarket sm = new Supermarket("Mall Vitan", listM);
		
		sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);		
		
	}
	
	@Test
	public void testException2() {
		
		ArrayList<Market> listM = new ArrayList<>();
		
		Supermarket sm = new Supermarket("Mall Vitan", listM);
		
		try {
			sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			fail("NOT OK should fail");
		} catch (ExceptionMarket e) {

			e.printStackTrace();
			
			assertTrue("It;s working", true);
		}		
		
	}
	
	@Test
	public void testPerformance() throws ExceptionMarket {
		System.out.println("testPerformance");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);	
		listM.add(m4);
		listM.add(m5);
		
		Supermarket sm = new Supermarket("Mall Bucharest", listM);
		
		double startTime = System.currentTimeMillis();
		sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		double stopTime = System.currentTimeMillis();
		
		assertTrue("It's fast!", stopTime - startTime < 5);

	}
	
	public Market getLargestMarket(ArrayList<Market> list, ETypeMarket marketType) {
		
		Market m = null;
		
		//sort list by area (TYPE)
		
		return m;
	}
	
	@Test
	public void testCrossCheck() throws ExceptionMarket {
		System.out.println("testCrossCheck");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);	
		listM.add(m4);
		listM.add(m5);
		
		Supermarket sm = new Supermarket("Mall Bucharest", listM);	
		
		Market expected = getLargestMarket(listM, ETypeMarket.BEAUTY);
		Market actualResult = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		assertEquals(expected, actualResult);
		
	}
	
	@Test
	public void testInversion() throws ExceptionMarket {
		System.out.println("testInversion");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);	
		listM.add(m4);
		listM.add(m5);
		
		Supermarket sm = new Supermarket("Mall Bucharest", listM);	
		
		Market result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		
		for (int i = 0; i < listM.size(); i++) {
			if(result.getName().equals(listM.get(i))){
				//maxArea
				//save position
			}
		}
		
		//check if the pos is between [0, listM.size() )

		
	}
	

}
