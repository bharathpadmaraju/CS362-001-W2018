package calendar;

import java.util.*;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

	/**
	 * Generate Random Tests that tests TimeTable Class.
	 */
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS = 100;

	@Test
	public void test01() throws Throwable {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start testing...");
		try {
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed = System.currentTimeMillis();
				Random random = new Random(randomseed);
				
				TimeTable tt = new TimeTable();
				TimeTable tt2 = null;

				LinkedList<Appt> appts = new LinkedList<Appt>();

				for (int i = 0; i < 3; i++) { 
					int startHour=ValuesGenerator.RandInt(random);
						int startMinute=ValuesGenerator.RandInt(random);
						int startDay=ValuesGenerator.RandInt(random);
						int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);

						int startYear=ValuesGenerator.RandInt(random);
					String title = "Birthday Party";
					String description = "This is my birthday party.";

					Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);

					appts.add(appt);
				}
				
				tt.deleteAppt(appts, appts.get(0)); 
				tt2.deleteAppt(appts, appts.get(1));
				tt2.deleteAppt(null,appts.get(2));
				tt2.deleteAppt(appts,null);
				tt2.deleteAppt(null,null);
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				if ((iteration % 10000) == 0 && iteration != 0)
					System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);

			}
		} catch (NullPointerException e) {

		}

		System.out.println("Done testing... 1st del appt");

	}
	
	 @Test
	 public void test02()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		TimeTable time = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();

		System.out.println("Start testing...");

	 try{
		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed = System.currentTimeMillis();
				Random random = new Random(randomseed);

				int sd= ValuesGenerator.RandInt(random);
				int sm= ValuesGenerator.RandInt(random);
				int sy= ValuesGenerator.RandInt(random);

				int ed= ValuesGenerator.RandInt(random);
				int em= ValuesGenerator.RandInt(random);
				int ey= ValuesGenerator.getRandomIntBetween(random, 1500, 2018);

				GregorianCalendar startday = new GregorianCalendar(sy, sm, sd);
				GregorianCalendar endday = new GregorianCalendar(ey, em, ed);

				time.getApptRange(appts, startday, endday);

				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				if ((iteration % 10000) == 0 && iteration != 0)
					System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		 }
	 }catch(NullPointerException e){

	 }

		System.out.println("Done testing...");
	}

}