package com.src;
import java.util.*;
import java.lang.*;
public class Day4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Greetings g = new Greetings() {
			public void display(){
				System.out.println("HI Good Morning");
			}
		};
		g.display();
	}	 
}
interface Greetings{
	public void display();
}
