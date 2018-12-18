package com.bkmandiri.helloworld;

public class Array {
	
	public int[] Arr() {
		int arr[];
		arr=new int[10];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
		return arr;
	}
	
	
	public void findEvens(int arr[]) {
		  int number;
		  for (int i = 0; i < arr.length; i++) {
		     if (arr[i] % 2 == 0) {
		    	 System.out.println(arr[i]);
		     }
		  }
	}
	
	public void findPrimes(int arr[]) {
		int i,m=0,flag=0;      
		  int n=3;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
	}
	
	
	
	public void findDivided(int arr[], int anissa) {
		 
		  for (int i = 0; i < arr.length; i++) {
			  
		    	 System.out.println(arr[i]/anissa);
		     
		  }
	}
	
}
