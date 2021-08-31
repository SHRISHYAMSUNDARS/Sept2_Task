package com.src;
import java.util.*;
public class Scientific_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0;double num=0;
		do
		{
			System.out.println("Enter The Choice:1 For Calculating SquareRoot");
			System.out.println("Enter The Choice:2 For Calculating logarthms");
			System.out.println("Enter The Choice:3 For Calculating Floor values");
			System.out.println("Enter The Choice:4 For Calculating Ceil Values");
			System.out.println("Enter The Choice:5 For Calculating Sin Calculation");
			System.out.println("Enter The Choice:6 For Calculating Cos Calculation");
			System.out.println("Enter The Choice:7 For Calculating Tan Calculation");
			n=sc.nextInt();
			if(n==8) break;
			else if(n==1) {
				System.out.println("Enter The Number For Calculating SquareRoot");
				num=sc.nextDouble();sc.nextLine();
				square_root(num);
			}
			else if(n==2) {
				System.out.println("Enter The Number For Calculating Logarthms");
				num=sc.nextDouble();sc.nextLine();
				logarthm(num);
			}
			else if(n==3){
				System.out.println("Enter The Number For Calculating Floor");
				num=sc.nextDouble();sc.nextLine();
				floor(num);
			}
			else if(num==4) {
				System.out.println("Enter The Number For Calculating Ceil");
				num=sc.nextDouble();sc.nextLine();
				ceil(num);
			}
			else if(n==5) {
				System.out.println("Enter The Number For Calculating Sin");
				num=sc.nextDouble();sc.nextLine();
				sin(num);
			}
			else if(n==6) {
				System.out.println("Enter The Number For Calculating Cos");
				num=sc.nextDouble();sc.nextLine();
				cos(num);
			}
			else if(n==7) {
				System.out.println("Enter The Number For Calculating Tan");
				num=sc.nextDouble();sc.nextLine();
				tan(num);
			}	
		}while(n<8);
        System.out.println("You Have Entered Choice: 5 so Exit");
	}
	private static void ceil(double num) {
		System.out.println("The Ceil of "+num+" is:"+Math.ceil(num));
	}
	public static void sin(double num) {
		System.out.println("The Sin of "+num+" is: "+Math.sin(num));	
	}
	public static void tan(double num) {
		System.out.println("The Tan of "+num+" is: "+Math.tan(num));	
	}
	public static void cos(double num) {
		System.out.println("The Cos of "+num+" is: "+Math.cos(num));
	}
	
	public static void floor(double num) {
		System.out.println("The Floor of "+num+" is: "+Math.floor(num));	
	}
	public static void logarthm(double num) {
		System.out.println("The Logarthm of "+num+" is: "+Math.log(num));	
	}
	public static void square_root(double num) {
		System.out.println("The Square Root of "+num+" is: "+Math.sqrt(num));	
	}
}
