package com.thread;

class MyTask1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
			
		}
	}
}
class MyTask2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
	}
}
public class JoinMethod  {
public static void main(String[] args) {
	try {
		MyTask1 m1 = new MyTask1();
		MyTask2 m2 = new MyTask2();
		m1.start();
		m2.start();
		m1.join();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}
