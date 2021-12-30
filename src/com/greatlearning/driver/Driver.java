package com.greatlearning.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.services.TranscationTargetAlgo;

public class Driver {

	public static void main(String[] args) {
			//initialize the Scanner
			// Get Total No Of Transaction
			// Initialize transactions array
			// Get total No of Targets
			//Process all the Target 
		   Scanner scanner=new Scanner(System.in);
		   TranscationTargetAlgo transactionTargetAlgo = new TranscationTargetAlgo();
		   System.out.println("Enter the Total no. of Transcation of transcation array");
		   //get total no of transaction of transaction array
		   int totalNoOfTranscations = scanner.nextInt();
		   // initialize the transactions array
		   int[] transcations = new int[totalNoOfTranscations];
		 
		   System.out.println("Enter the values of transcations");
		   		//Get the transactions
		   for(int i=0 ; i<totalNoOfTranscations; i++)   
			   transcations[i] = scanner.nextInt();
			// Get the no of targets
			   System.out.println("enter the total no of targets that needs to be achieved");
			   int targetCount = scanner.nextInt();
			   int target;
			   // calculate the min and over all sum and check
			   //Input : arr[]= {10,20,10,5,15 }
			   //Outpout: prefixSum[] = {10,30,40,45,60}
			   int prefixsum[]= new int[totalNoOfTranscations];
			   prefixsum[0] = transcations[0];
			   for(int i=1;i<totalNoOfTranscations;i++)  {
				   prefixsum[i] = prefixsum[i-1] + transcations[i] ;
			   }
			   System.out.println(Arrays.toString(prefixsum));
			   for(int i=0;i<targetCount;i++)  {
				   System.out.println("enter the value of target");
				   target = scanner.nextInt();
				   transactionTargetAlgo.processTransactions(prefixsum, target);
			 }		   
	   }	   
}

