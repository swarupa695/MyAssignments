package myAssignments.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0;
        int b=1;
        int c;
       int count=10;
       System.out.print(a+" "+b);  
       for(int i=2; i<=count; i++) {
    	   c=a+b;
    	System.out.print(" "+c);  
    	a=b;
    	b=c;
       }
       }
		}
		
		
		
