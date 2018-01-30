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
	  	Appt appt3 = new Appt(12, 50, 13, 08, 2017, "test 3", "test appt 3");
	  	Appt appt4 = new Appt(08, 51, 14, 03, 2017, "test 4", "test appt 4");
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
		int[] pv = {0,1};
		 
		TimeTable tb = new TimeTable();
		 
		LinkedList<Appt> appts = new LinkedList<Appt>();
	  	Appt appt1 = new Appt(16, 30, 12, 10, 2017, "test 1", "test appt 1");
	  	Appt appt2 = new Appt(14, 40, 11, 04, 2017, "test 2", "test appt 2");
	  	Appt appt3 = new Appt(12, 50, 13, 08, 2017, "test 3", "test appt 3");
	  	Appt appt4 = new Appt(08, 51, 14, 03, 2017, "test 4", "test appt 4");
	  	Appt appt5 = new Appt(11, 33, 15, 02, 2017, "test 5", "test appt 5");

	 	 appts.add(appt1);
	  	 appts.add(appt2); 
	  	 appts.add(appt3); 
	  	 appts.add(appt4);
	  	 appts.add(appt5);
		 
		 assertNotNull(tb.permute(appts, pv));
		 
	 }
	 @Test
	  public void test03()  throws Throwable  {
		 
		TimeTable tb = new TimeTable();
		 
		LinkedList<Appt> appts = new LinkedList<Appt>();
	  	Appt appt1 = new Appt(16, 30, 12, 10, 2017, "test 1", "test appt 1");
	  	Appt appt2 = new Appt(14, 40, 11, 04, 2017, "test 2", "test appt 2");
	  	Appt appt3 = new Appt(12, 50, 13, 08, 2017, "test 3", "test appt 3");
	  	Appt appt4 = new Appt(08, 51, 14, 03, 2017, "test 4", "test appt 4");
	  	Appt appt5 = new Appt(11, 33, 15, 02, 2017, "test 5", "test appt 5");

	 	 appts.add(appt1);
	  	 appts.add(appt2); 
	  	 appts.add(appt3); 
	  	 appts.add(appt4);
	  	 appts.add(appt5);
		 
		 assertNotNull(tb.deleteAppt(appts, appt1));
		 assertNotNull(tb.deleteAppt(appts, appt2));
		 assertNotNull(tb.deleteAppt(appts, appt3));
		 assertNotNull(tb.deleteAppt(appts, appt4));
		 assertNotNull(tb.deleteAppt(appts, appt5));
		 assertNull(tb.deleteAppt(appts, appt1));
	 }
//add more unit tests as you needed
}
