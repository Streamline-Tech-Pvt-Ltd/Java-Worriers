package com.thread;

import java.lang.classfile.Interfaces;

public class ImplementsInterface implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}
	public static void main(String[] args) {
		ImplementsInterface i = new ImplementsInterface();
		Thread t = new Thread(i);
		t.start();

	}

	

}
