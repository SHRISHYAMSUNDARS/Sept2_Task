package com.src;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Day9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Date To Find Age:");
		String date=sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.parse(date, formatter);
		Period p = Period.between(birthday, today);
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
		                   " months and " + p.getDays() +
		                   " days old.");
	}
}
