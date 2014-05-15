import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CustomerTestCase {


	private Customer customer1;
	private Customer customer2;
	private Customer customer3;
	private Customer customer4;
	
	private Rental rental1;
	private Rental rental2;
	
	private Movie movie1;
	private Movie movie2;
	
	private final static String name1 = "asdjlk";
	private final static String name2 = "sd.fkluadik";
	private final static String name3 = "awouail3";
	private final static String name4 = "ASDskdjalskd";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
		movie1 = new Movie("mmmmmm", Movie.CHILDRENS);
		movie1 = new Movie("kkkkkk", Movie.NEW_RELEASE);
		
		rental1 = new Rental(movie1, 2);
		rental2 = new Rental(movie2, 3);
		
		customer1 = new Customer(name1);
		customer2 = new Customer(name2);
		customer3 = new Customer(name3);
		customer4 = new Customer(name4);
		
		customer1.addRental(rental1);
		customer1.addRental(rental2);
	}


	@After
	public void tearDown() throws Exception {
	}


	/**
	 * Tests the public constructor, and getName
	 */
	@Test
	public void testCustomer() {
		assertNotNull(customer1);
		assertEquals(name1, customer1.getName());
		assertNotNull(customer2);
		assertEquals(name2, customer2.getName());
		assertNotNull(customer3);
		assertEquals(name3, customer3.getName());
		assertNotNull(customer4);
		assertEquals(name4, customer4.getName());
	}


	@Test
	public void testAddRental() {
		// nothing to do here. srsly
	}


	@Test
	public void testStatement() {
		System.out.println(customer1.statement());
	}

}
