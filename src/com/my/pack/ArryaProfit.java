package com.my.pack;

public class ArryaProfit {

	public static void main(String[] args) {
		
		int[] arr= {5,10,20,25,10,50,10};
		int arrylength=arr.length;	
		System.out.println("array length :"+arrylength);
		        int maxprofit = 0;
		        int minval = 0;
		        int maxloss=0;
			    int maxval=0;
			    int iP=0;
			    int jP=0;
			    int iL=0;
			    int jL=0;
			    
		        for (int i = 0; i < arrylength; i++)
		        {
		        	//max profit
		            if (arr[i] < arr[minval]) 
		            {
		                minval = i;
		            }

		            if (arr[i] - arr[minval] > maxprofit) 
		            {
		                maxprofit = arr[i] - arr[minval];
		                iP=i;
		                jP=minval;
		              
		            }     
		            
		            //max loss
		            if (arr[i] > arr[maxval]) {
		                maxval = i;
		            }

		            if (arr[maxval] - arr[i] > maxloss) {
		                maxloss = arr[maxval] - arr[i];
		                iL=i;
		                jL=maxval;
		            } 
		            
		        }
		        System.out.println("max. profit is "+maxprofit+" i value and J Values are "+iP+" "+jP);
                System.out.println("max loss is "+maxloss+" i value and J Values are "+iL+" "+jL);
	}

}
