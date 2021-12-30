package com.greatlearning.services;

public class TranscationTargetAlgo {

	public void processTransactions(int [] prefixsum,int target) {
		 int flag=0;
		for (int i = 0; i < prefixsum.length; i++) { //linear iteration , linear searching
			
			// check if target is achieved	
			if(prefixsum[i] >= target)  {
				System.out.println("Target achieved after " +(i+1)+" transactions \n");
				flag = 1;
				break;
			}
		}
		// check if looped across all the transactions
		if(flag == 0)  {
			System.out.println(" Given target is not achieved ");
		}
		
	}
	
}
