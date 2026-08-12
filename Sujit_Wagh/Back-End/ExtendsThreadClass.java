package com.thread;

import com.sun.tools.javac.Main;

public class ExtendsThreadClass  extends Thread{

	public void run() {
		System.out.println("Thread is starting");
	
	}
	public static void main(String[] args) {
		ExtendsThreadClass e = new ExtendsThreadClass();
      e.start();
	}
}
