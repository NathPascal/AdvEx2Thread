package fr.fms.Test; //2.1

// Le résultat est différent à chaque fois qu'on relance le programme
//parce que les threads se font concurrence pour s'afficher vu qu'ils se partagent le syso

public class TestThread extends Thread{
	
	public TestThread(String name) {
		super(name);
	}
	
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.print(getName() + " ");
		}
	}

	public static void main(String[] args) {
		TestThread t = new TestThread("1-");
		TestThread t2 = new TestThread("2--");
		TestThread t3 = new TestThread("3---");
		TestThread t5 = new TestThread("5-----");
		TestThread t4 = new TestThread("4----");
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
