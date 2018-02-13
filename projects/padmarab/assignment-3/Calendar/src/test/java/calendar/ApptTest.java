package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
/*
	@Test
	 public void test02()  throws Throwable  {
		//Here I test out the bug I wrote 
		int startHour=27;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		assertFalse(appt.getValid());
		 
	 }
	 */
	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		
		appt.setStartHour(18);
		appt.setStartMinute(40);
		appt.setStartDay(3);
		appt.setStartMonth(3);
		appt.setStartYear(2018);

		 assertEquals(18, appt.getStartHour());
		 assertEquals(40, appt.getStartMinute());
		 assertEquals(3, appt.getStartDay());
		 assertEquals(3, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());      		
	 }
	 @Test
	  public void test04()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
				 
		assertEquals(0,appt.getRecurIncrement());
		assertEquals(0,appt.getRecurNumber());
		assertEquals(2,appt.getRecurBy());        		
	 }
	 @Test
	  public void test05()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
				 
		assertEquals(0, appt.compareTo(appt2));
		
		       		
	 }
	@Test
	public void test06() throws Throwable {
		 Appt appt1 = new Appt(2, 25, 12, 10, 2017, "test 1", "test appt 1");
		 appt1.setStartHour(16);
		 appt1.setStartHour(30);
		// String newString = appt1.representationApp();
		 //assertEquals("4:30pm",newString);
	 }
	 @Test
	public void test07() throws Throwable {
		 Appt appt1 = new Appt(1, 30, 12, 10, 2017, "test 1", "test appt 1");
		 appt1.setStartHour(0);
		 assertTrue(appt1.getValid());
		 appt1.setStartHour(23);
		 assertTrue(appt1.getValid());
		 Appt appt2 = new Appt(16, 1, 12, 10, 2017, "test 1", "test appt 1");
		 appt2.setStartMinute(0);
		 assertTrue(appt2.getValid());
		 appt2.setStartMinute(59);
		 assertTrue(appt2.getValid());
		 Appt appt3 = new Appt(16, 30, 1, 10, 2017, "test 1", "test appt 1");
		 appt3.setStartDay(1);
		 assertTrue(appt3.getValid());
		// Appt appt4 = new Appt(16, 30, 12, 1, 2017, "test 1", "test appt 1");
		// appt4.setStartMonth(1);
		 
		 assertTrue(appt1.getValid());
		 assertTrue(appt2.getValid());
		// assertTrue(appt3.getValid());
		// assertTrue(appt4.getValid());
		 
	 }
	  @Test
	  public void test08()  throws Throwable  {
		// Appt appt1 = new Appt(3, 12, 8, 0, 2017, "test 1", "test appt 1");
		 //assertNull(appt1.toString());
		  Appt appt2 = new Appt(03, 40, 11, 04, 2017, "test 2", "test appt 2");
		 assertNotEquals("\t04/11/2017 at 3:40pm , test2, test appt 2\n",appt2.toString());
		  Appt appt3 = new Appt(04, 40, 11, 04, 2017, "test 2", "test appt 2");
		  appt3.setStartHour(-4);
		  assertNull(appt3.toString());
	  }
	  @Test
	  public void test09()  throws Throwable  {
		  Appt appt2 = new Appt(03, 40, 11, 04, 2017, "test 2", "test appt 2");
		  appt2.setStartMinute(70);
		  assertNull(appt2.toString());
		  Appt appt3 = new Appt(03, 40, 11, 04, 2017, "test 3", "test appt 3");
		  appt3.setStartDay(0);
		  assertNull(appt3.toString());
	  }
	
	  @Test
	  public void test10()  throws Throwable  {
		 Appt appt2 = new Appt(03, 40, 11, 04, 2017, "test 2", "test appt 2");
		 int[] recurDays = {};
		 appt2.setRecurrence(recurDays,3,4,2);
	  }
	  @Test
	  public void test11()  throws Throwable  {
		 Appt appt2 = new Appt(1, 35, 14, 03, 2017, "NULL", "NULL");
		 assertNotNull(appt2.toString());
		 assertEquals("	3/14/2017 at 1:35am ,NULL, NULL\n", appt2.toString());
	/*  }
	  @Test
	  public void test12()  throws Throwable  {
		 Appt appt2 = new Appt(1, 35, 14, 03, 2017, "NULL", "NULL");
		 appt2.setStartHour(-1);
		 assertNull(appt2.toString());*/
	  }
	  @Test
	  public void test13()  throws Throwable  {
		 Appt appt = new Appt(1, 35, 14, 03, 2017, "NULL", "NULL");
		 appt.setStartHour(0);
		 assertTrue(appt.getValid());

		 appt.setStartHour(23);
		 assertTrue(appt.getValid());

		 appt.setStartMinute(0);
		 assertTrue(appt.getValid());

		 appt.setStartMinute(59);
		 assertTrue(appt.getValid());

		 appt.setStartDay(1);
		 assertTrue(appt.getValid());

		 appt.setStartDay(31);
		 assertTrue(appt.getValid());

		 appt.setStartMonth(1);
		 assertTrue(appt.getValid());

		 appt.setStartMonth(12);
		 assertTrue(appt.getValid());

		 appt.setStartHour(30);
		 assertFalse(appt.getValid());

		 appt.setStartMinute(70);
		 assertFalse(appt.getValid());

		 appt.setStartDay(40);
		 assertFalse(appt.getValid());

		 appt.setStartYear(858239);
		 assertFalse(appt.getValid());
	  }

	  
	
}

