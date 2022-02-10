package com.cpmg.day10;

class RunnableThead implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread class " + Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class MyRunnable {
	public static void main(String args[]) {
		RunnableThead t = new RunnableThead();
		Thread t1 = new Thread(t);
		t1.setName("T1");
		t1.start();
		Thread t2 = new Thread(t);
		t2.setName("T2");
		t2.start();

	}
}
