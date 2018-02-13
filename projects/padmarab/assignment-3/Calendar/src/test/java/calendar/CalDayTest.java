package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		  
		  CalDay calDay = new CalDay();
		  assertEquals(false, calDay.valid);
		  assertEquals(false,calDay.isValid());

	 }
	 
	 @Test
	  public void test02()  throws Throwable  {
		CalDay calDay = new CalDay();
		calDay.day = 1;
		calDay.month = 1;
		calDay.year = 2018;
		assertEquals(1, calDay.getMonth());
		assertEquals(1, calDay.getDay());
		assertEquals(2018, calDay.getYear());
	}
	  @Test
	  public void test03()  throws Throwable  {
		GregorianCalendar gc = new GregorianCalendar();
		CalDay calDay = new CalDay(gc);	
		calDay.toString();
		Appt appt1 = new Appt(1, 30, 12, 10, 2017, "test 1", "test appt 1");
		Appt appt2 = new Appt(2, 30, 12, 10, 2017, "test 1", "test appt 1");
		Appt appt3 = new Appt(3, 30, 12, 10, 2017, "test 1", "test appt 1");
		Appt appt4 = new Appt(4, 30, 12, 10, 2017, "test 1", "test appt 1");
		
		calDay.addAppt(appt1);
		calDay.addAppt(appt2);
		calDay.addAppt(appt3);
		calDay.addAppt(appt4);
		
		assertNotNull(calDay.iterator());
		assertNotNull(calDay.getSizeAppts());
		assertEquals(4, calDay.getSizeAppts());
		
		CalDay calDay2 = new CalDay();
		assertNotNull(calDay2.toString());
		
	 }
	 @Test
	  public void test04()  throws Throwable  {
		CalDay calDay = new CalDay();
		calDay.day = 1;
		calDay.month = 1;
		calDay.year = 2018;
		assertEquals(1, calDay.getMonth());
		assertEquals(1, calDay.getDay());
		assertEquals(2018, calDay.getYear());
		
		Appt appt1 = new Appt(1, 61, 12, 10, 2017, "test 1", "test appt 1");
	
		CalDay calDay2 = new CalDay();
		CalDay calDay3 = new CalDay();
		

	}
	 @Test
	  public void test05()  throws Throwable  {
		
		GregorianCalendar gc = new GregorianCalendar(2018, 10, 14);
		
		CalDay calDay = new CalDay(gc);
		
		assertEquals(14, calDay.getDay());
		assertEquals(10, calDay.getMonth());
		assertEquals(2018, calDay.getYear());
		
	}
	@Test
	  public void test06()  throws Throwable  {
		
		
		CalDay calDay = new CalDay();
		
		calDay.toString();
		assertNull(calDay.iterator());
		
	}
	
}
