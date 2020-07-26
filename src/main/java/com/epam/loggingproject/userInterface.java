package com.epam.loggingproject;
import java.io.PrintStream;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class userInterface {
	 private static final Logger LOGGER=LogManager.getLogger(userInterface.class);
      public static void main(String args[])
      {
    	 
    	  Scanner sc=new Scanner(System.in);
    	  PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
    	  int principal_amount;
    	  double rate_of_interest;
    	  int no_of_times;
    	  int time;
    	  LOGGER.info("Using Logger");
    	  LOGGER.info("To calculate Simple Interest and Compound Interest");
  	   	LOGGER.info("\n\nEnter Principal amount \nRate of Interest(r/100) \nTime in years \nNumber of times interest applied per time period\n");
    	  principal_amount=sc.nextInt();
    	  rate_of_interest=sc.nextDouble();
    	  time=sc.nextInt();
    	  no_of_times=sc.nextInt();
    	  interest myinterest=new interest();
    	  double simplevalue=myinterest.SimpleInterest(principal_amount, rate_of_interest, time);
    	 
    	  double compoundvalue=myinterest.CompoundInterest(principal_amount, rate_of_interest, time, no_of_times);
    	  
  	    LOGGER.info("Simple Interest is:"+ myinterest.SimpleInterest(principal_amount, rate_of_interest,time));
  	   
  	    LOGGER.info("Compound Interest is:"+ myinterest.CompoundInterest(principal_amount, rate_of_interest, time, no_of_times));  	    
  	    
  	    LOGGER.info("House Construction");
  	    LOGGER.info("\n\nEnter Total area and Standard(1-standard  2-above standard  3-high standard):\n");    	  
    	
    	  double total_area=sc.nextDouble();
    	  int standard=sc.nextInt();
    	  LOGGER.info("\nDo you want a Fully Automated Home??\n If yes press 1 else 0:\n ");
    	  int press=sc.nextInt();
    	  boolean fully_automated_home=press==1?true:false;
    	  
    	  construction_cost cc=new construction_cost(total_area,standard,fully_automated_home);
    		LOGGER.info("Construction Cost Of Home is:"+ cc.estimate()+"\n\n");	
   		 LOGGER.info("Exiting Program..");
    	  
    	  sc.close();
      }
}