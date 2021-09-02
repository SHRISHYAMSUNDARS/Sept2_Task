package com.src;


import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;


public class BankSystem {
	private static Logger logger=Logger.getLogger(BankSystem.class);
	public static void main(String[] args) throws IOException {
		//Layout layout=new SimpleLayout();
		//Layout layout=new HTMLLayout();
		//Layout layout=new XMLLayout();
		Layout layout=new PatternLayout("%p:%d-%c %M : %m %l %n");
		Appender appender=new ConsoleAppender(layout);
		//Appender appender=new FileAppender(layout,"D:\\Java Program\\AppendFile.log");
		logger.addAppender(appender);
	    logger.debug("Your Bank Account is Created");
	    logger.info("Welcome SHRI SHYAM SUNDAR S");
	    logger.warn("Maintain Rs:10000 Balance");
	    logger.error("Your Bank Account Does Not have Sufficient Balance Kindly Deposit");
	    logger.fatal("This May Creates a Problem if you Not Depositing ");
		
		}
}