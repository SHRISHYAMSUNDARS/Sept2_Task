package com.src;



public class Day4 {
	public static void main(String[] args) {
		Thread1 object=new Thread1() {
			public void run() {
				System.out.println("Bye");
			}
		};
		object.start();
		new Thread(() ->{
			System.out.println("Hello");
			
			
		}).start();
	}	
}
class Thread1 extends Thread
{
	public void run() {
		System.out.println("Hi");
	}
}
