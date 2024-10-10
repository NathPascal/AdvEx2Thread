package fr.fms.Test;

public class TestRunnable implements Runnable{

	
	@Override
	public void run() {
		
		for(int i = 1; i < 11; i ++) {
			System.out.print((char)(32 + i));
			for(int j = 0; j<i; j++ ) {
			System.out.print("*");
			}
			System.out.println((char)(32 + i));
		}
	}
	

	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	
	}

}
