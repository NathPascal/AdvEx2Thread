package fr.fms.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

  public static void main(String[] args) {
    //DateFormat df = new SimpleDateFormat("HH:mm:ss");
    Thread thread = new Thread(new MonRunnable(1000));

    //System.out.println(df.format(new Date()));

    thread.start();
  }

  private static class MonRunnable implements Runnable {

    private long delai;
    private DateFormat df;

    public MonRunnable(long delai) {
      this.delai = delai;
      this.df = new SimpleDateFormat("HH:mm:ss");
    }

    @Override
    public void run() {
    	while(true) {
	      try {
	        Thread.sleep(delai);
	        System.out.println(df.format(new Date()));
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
    	}
    }
  }
}