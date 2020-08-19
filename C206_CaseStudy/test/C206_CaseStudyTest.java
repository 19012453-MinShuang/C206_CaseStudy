import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Transaction t1;
	private Transaction t2;
	
	
	private ArrayList<Transaction> TransactionList;
	private ArrayList<Transaction> ArchiveList;

	
	
	public C206_CaseStudyTest() {
		super();
	}
	
	
	
	
	
	@Before
	public void setUp() throws Exception {
		//Prepare the test data
		
		//Transaction ID
		t1 = new Transaction(9000,"John","container","Mary");
		t2 =new Transaction(9000,"John","container","Mary");
		

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		public static void addTransaction(ArrayList<Transaction> TransactionList, Transaction t) {
			    // Item list is not null, so that can add a new item
			    assertNotNull("Test if there is valid Transaction arraylist to add to", TransactionList);
			    
			    //Given an empty list, after adding 1 item, the size of the list is 1
			    C206_CaseStudy.addTransaction(TransactionList, t1);    
			    assertEquals("Test if that Transaction arraylist size is 1?", 1, TransactionList.size());
			    
			    //The item just added is as same as the first item of the list
			    assertSame("Test that Transaction is added same as 1st item of the list?", t1, TransactionList.get(0));
			    
			    //Add another item. test The size of the list is 2?
			    C206_CaseStudy.addTransaction(TransactionList, t2);
			    assertEquals("Test that Transaction arraylist size is 2?", 2, TransactionList.size());
			  
			  


		
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
	}

}
