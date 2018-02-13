package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {

	  	TimeTable tb = new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(2015, 01, 01);
	  	GregorianCalendar lastDay = new GregorianCalendar(2017, 12, 31);

	  	LinkedList<Appt> appts = new LinkedList<Appt>();
	  	Appt appt1 = new Appt(16, 30, 12, 10, 2017, "test 1", "test appt 1");
	  	Appt appt2 = new Appt(14, 40, 11, 04, 2017, "test 2", "test appt 2");
	  	Appt appt3 = new Appt(12, 50, 13, 1, 2017, "test 3", "test appt 3");
	  	Appt appt4 = new Appt(1, 51, 14, 03, 2017, "test 4", "test appt 4");
	  	Appt appt5 = new Appt(11, 33, 15, 02, 2017, "test 5", "test appt 5");

	 	 appts.add(appt1);
	  	 appts.add(appt2); 
	  	 appts.add(appt3); 
	  	 appts.add(appt4);
	  	 appts.add(appt5);
		
	  	 int[] recurDays = {1, 3, 5};
		 int recurBy = 1;
		 int recurIncrement = 2;
		 int recurNumber = 3;

		 appt1.setRecurrence(recurDays, recurBy, recurIncrement, recurNumber);


	  	assertNotNull(tb.getApptRange(appts, firstDay, lastDay));

	
	 }
	 @Test
	  public void test02()  throws Throwable  {

	  	TimeTable tb = new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(2015, 01, 01);
	  	GregorianCalendar lastDay = new GregorianCalendar(2017, 12, 31);

	  	LinkedList<Appt> appts = new LinkedList<Appt>();
	  	Appt appt1 = new Appt(16, 30, 12, 10, 2017, "test 1", "test appt 1");
	  	Appt appt2 = new Appt(14, 40, 11, 04, 2017, "test 2", "test appt 2");
	  	Appt appt3 = new Appt(12, 50, 13, 1, 2017, "test 3", "test appt 3");
	  	Appt appt4 = new Appt(1, 51, 14, 03, 2017, "test 4", "test appt 4");
	  	Appt appt5 = new Appt(11, 33, 15, 02, 2017, "test 5", "test appt 5");
		
		
		
		LinkedList<Appt> appts2 = new LinkedList<Appt>();
		Appt appt6 = new Appt(16, 63, 12, 10, 2017, "test 1", "test appt 1");
		appts2.add(appt6);

	 	 appts.add(appt1);
	  	 appts.add(appt2); 
	  	 appts.add(appt3); 
	  	 appts.add(appt4);
	  	 appts.add(appt5);
		 
		 assertNotNull(tb.deleteAppt(appts, appt4));
		
		 TimeTable tb2 = new TimeTable();
		// assertNotNull(tb2.deleteAppt(appts2, appt6));
		 
		 TimeTable tb3 = new TimeTable();
		 
		 assertNull(tb3.deleteAppt(null,null));
	
	 }
	 @Test
	  public void test03()  throws Throwable  {

	  	TimeTable tb = new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(2015, 01, 01);
	  	GregorianCalendar lastDay = new GregorianCalendar(2017, 12, 31);

	  	LinkedList<Appt> appts = new LinkedList<Appt>();
	  	Appt appt1 = new Appt(16, 30, 12, 10, 2017, "test 1", "test appt 1");
	  	Appt appt2 = new Appt(14, 40, 11, 04, 2017, "test 2", "test appt 2");
	  	Appt appt3 = new Appt(12, 50, 13, 1, 2017, "test 3", "test appt 3");
	  	Appt appt4 = new Appt(1, 51, 14, 03, 2017, "test 4", "test appt 4");
	  	Appt appt5 = new Appt(11, 33, 15, 02, 2017, "test 5", "test appt 5");
		
	 	 appts.add(appt1);
	  	 appts.add(appt2); 
	  	 appts.add(appt3); 
	  	 appts.add(appt4);
	  	 appts.add(appt5);
		 
		int[] permute = {4,3,2,1,0};
		assertNotNull(tb.permute(appts, permute));
		
	
	 }
	 @Test
	  public void test04()  throws Throwable  {

	  	TimeTable tb = new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(2015, 01, 01);
	  	GregorianCalendar lastDay = new GregorianCalendar(2017, 12, 31);
		
		//CalDay calDay1 = CalDay(firstDay);
		//CalDay calDay2 = CalDay(lastDay);
		

	  	LinkedList<Appt> appts = new LinkedList<Appt>();
	  	Appt appt1 = new Appt(16, 30, 12, 10, 2017, "test 1", "test appt 1");
	  	Appt appt2 = new Appt(14, 40, 11, 04, 2017, "test 2", "test appt 2");
	  	Appt appt3 = new Appt(12, 50, 13, 1, 2017, "test 3", "test appt 3");
	  	Appt appt4 = new Appt(1, 51, 14, 03, 2017, "test 4", "test appt 4");
	  	Appt appt5 = new Appt(11, 33, 15, 02, 2017, "test 5", "test appt 5");
		//Appt appt6 = new Appt(14, 40, 11, 04, 2017, "test 2", "test appt 2");

	 	 appts.add(appt1);
	  	 appts.add(appt2); 
	  	 appts.add(appt3); 
	  	 appts.add(appt4);
	  	 appts.add(appt5);
		
	  	 int[] recurDays = {};
		 int recurBy = 1;
		 int recurIncrement = 2;
		 int recurNumber = 0;

		 appt1.setRecurrence(recurDays, recurBy, recurIncrement, recurNumber);


	  	assertNotNull(tb.getApptRange(appts, firstDay, lastDay));
		
	
	 }
	 
	 @Test
	  public void test05()  throws Throwable  {
			TimeTable tb = new TimeTable();
			Appt appt1 = new Appt(16, 30, 12, 10, 2017, "test 1", "test appt 1");
			Appt appt2 = new Appt(14, 40, 11, 04, 2017, "test 2", "test appt 2");
			LinkedList<Appt> appts = new LinkedList<Appt>();
			appts.add(appt1);
			appts.add(appt2);
			
			GregorianCalendar firstDay = new GregorianCalendar(2015, 01, 01);
			GregorianCalendar lastDay = new GregorianCalendar(2017, 12, 31);
			
			//CalDay calDay1 = new CalDay(firstDay);
			//CalDay calDay2 = new CalDay(lastDay);
			
			int[]recurDays = {2,4,6};
			appt1.setRecurrence(recurDays, 1, 2, 3);
			appts.add(appt1);
			int[]recurNew = new int[0];
			appt2.setRecurrence(recurNew, 1, 2, 4);
			appts.add(appt2);
			assertNotNull(tb.getApptRange(appts, firstDay, lastDay));
			assertEquals(0, tb.getApptRange(appts, firstDay, lastDay).get(0).getSizeAppts());
			
	  }
	  
	  @Test
	  public void test06()  throws Throwable  {
		TimeTable tb = new TimeTable();
		 
		LinkedList<Appt> appts = new LinkedList<Appt>();
	  	Appt appt1 = new Appt(16, 30, 12, 10, 2017, "test 1", "test appt 1");
	  	Appt appt2 = new Appt(14, 40, 11, 04, 2017, "test 2", "test appt 2");
	  	Appt appt3 = new Appt(12, 50, 13, 1, 2017, "test 3", "test appt 3");
	  	Appt appt4 = new Appt(1, 51, 14, 03, 2017, "test 4", "test appt 4");
	  	Appt appt5 = new Appt(11, 33, 15, 02, 2017, "test 5", "test appt 5");

		 assertNull(tb.deleteAppt(appts, appt1));
		 assertNull(tb.deleteAppt(appts, appt2));
		 assertNull(tb.deleteAppt(appts, appt3));
		 assertNull(tb.deleteAppt(appts, appt4));
		 assertNull(tb.deleteAppt(appts, appt4));
		 
		 
	 	 appts.add(appt1);
	  	 appts.add(appt2); 
	  	 appts.add(appt3); 
	  	 appts.add(appt4);
	  	 appts.add(appt5);
		 
		 assertNull(tb.deleteAppt(appts,null));
		 assertNull(tb.deleteAppt(null,appt1));
		 
	  }

//add more unit tests as you needed
}