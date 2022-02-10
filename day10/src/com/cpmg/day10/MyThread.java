package com.cpmg.day10;
class TestThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++){
		System.out.println("Thread class "+currentThread().getName());
		try {
			currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class MyThread {
public static void main(String args[]) {
	TestThread t1=new TestThread();
	TestThread t2=new TestThread();
	TestThread t3=new TestThread();
	TestThread t4=new TestThread();
	TestThread t5=new TestThread();
	t1.setName("T1");
	t2.setName("T2");
	t3.setName("T3");
	t4.setName("T4");
	t5.setName("T5");
	
	t1.setPriority(10);
	t2.setPriority(8);
	t3.setPriority(6);
	t4.setPriority(4);
	t5.setPriority(1);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
}
}
