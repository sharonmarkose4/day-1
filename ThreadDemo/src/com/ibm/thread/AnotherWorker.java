package com.ibm.thread;

public class AnotherWorker implements Runnable{
	
		@Override
		public void run() {
			System.out.println("in another worker"+Thread.currentThread());
		}

	
} 

