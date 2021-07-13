package Week.day1;

public class Assignment_fibonanci_series {
	
		public static void main(String args[])
		{  
		 int n1=0,n2=1,n3,i,given_number=5;  
		 
		 System.out.print(n1+" "+n2);
		  
		 for(i=1;i<given_number;++i)
			 
		 {  
			 
		  n3=n1+n2;  
		  
		  System.out.print(" "+n3);  
		  
		  n1=n2;  
		  
		  n2=n3;  
		  
		 }  

		}

}
