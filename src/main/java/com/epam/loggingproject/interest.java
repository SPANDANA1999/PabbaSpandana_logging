package com.epam.loggingproject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class interest {
	 private static final Logger LOGGER=LogManager.getLogger(interest.class);
	   public double SimpleInterest(int principal_amount,double rate_of_interest,int time)
	   {
		   LOGGER.info("Entered SimpleInterest method.");
		   return principal_amount*rate_of_interest*time;
	   }
	   public double CompoundInterest(int principal_amount,double rate_of_interest,int time,int no_of_times)
	   {
		   LOGGER.info("Entered CompoundInterest method.");
		   return (principal_amount*Math.pow(1+(rate_of_interest/no_of_times),no_of_times*time))-principal_amount;
	   }
	}
