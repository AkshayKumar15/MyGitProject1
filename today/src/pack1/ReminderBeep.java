package pack1;

import java.awt.Toolkit;
import java.text.*;
import java.util.*;

/**
 * Simple demo that uses java.util.Timer to schedule a task to execute once 5
 * seconds have passed.
 */

public class ReminderBeep {
  Toolkit toolkit;

  Timer timer;
  DateFormat dateFormat = new SimpleDateFormat("ss");
  Date date = new Date();
  int second = 0;
  static int previous = 0;
  int present = 0;
		  
  
 

  public ReminderBeep(int seconds) {
    toolkit = Toolkit.getDefaultToolkit();
    timer = new Timer();
    timer.schedule(new RemindTask(), seconds * 1000);
  }

  class RemindTask extends TimerTask {
    public void run() {
    	
      System.out.println("Time's up!"+(Integer.valueOf(dateFormat.format(date))-previous));
      previous =Integer.valueOf(dateFormat.format(date));
     
      
     
    }
  }

  public static void main(String args[]) throws InterruptedException {
	  new ReminderBeep(1);
	  Thread.sleep(1000);
	  System.out.println("the test is ready to run");
	  
	  new ReminderBeep(3);
	  Thread.sleep(3000);
	  System.out.println("the door is opened");
	  
	  new ReminderBeep(4);
	  Thread.sleep(4000);
	  System.out.println("the door is closed");
	  
	  new ReminderBeep(5);
	  Thread.sleep(5000);
	  System.out.println("the test is finished");
	  
	  System.out.println("Task scheduled.");
  }
}
