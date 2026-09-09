package com.main.Exception;

class A implements Runnable{
	@Override
	public void run() {
		System.out.println("thread created");
	}
	
}

public class Mainse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new A());
		t1.start();
	}

}
