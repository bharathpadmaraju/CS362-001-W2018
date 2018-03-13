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
		CalDay calDay = new CalDay();
		calDay.day = 1;
		calDay.month = 1;
		calDay.year = 2018;
		assertEquals("`--- 1/1/2018 --- \n --- -------- Appointments ------------ --- \n", calDay.toString());
	}
	@Test
	public void test04()  throws Throwable  {  
		  CalDay calDay = new CalDay();
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
				 
		  calDay.addAppt(appt);
		  assertEquals(1, calDay.getSizeAppts());
	 }
	  @Test
	  public void test05()  throws Throwable  {
		GregorianCalendar gc = new GregorianCalendar();
		CalDay calDay = new CalDay(gc);		
	 }
	 @Test
	  public void test06()  throws Throwable  {
		GregorianCalendar gc = new GregorianCalendar();
		CalDay calDay = new CalDay(gc);		
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
				 
		  calDay.addAppt(appt);
		  calDay.iterator();
	 }
	 @Test
	  public void test07()  throws Throwable  {
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
				 
		CalDay calDay = new CalDay();
		assertEquals(true,calDay.isValid());
		assertNotNull(calDay.iterator());
	 }
	  @Test
	  public void test08()  throws Throwable  {
		GregorianCalendar gc = new GregorianCalendar(2017,12,16);
		CalDay cd = new CalDay(gc);
		cd.toString();
		assertEquals(2017,cd.getYear());
		assertEquals(12,cd.getMonth());
		assertEquals(16,cd.getDay());
		
	 }
//add more unit tests as you needed	
}
