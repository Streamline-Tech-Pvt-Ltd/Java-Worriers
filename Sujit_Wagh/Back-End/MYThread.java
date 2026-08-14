package com.thread;
class MYThread extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++)
			{
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class SleepMethod {
public static void main(String[] args) {
	MYThread m = new MYThread();
	m.start();
}
}
