package myAssignments.day1;

public class IsPrimeNumber {

	 public static void main(String[] args) {

		    int num = 23;
		    int count = 0;
		    for (int i = 2; i < num; ++i) {
		      // condition for non prime number
		      if (num % i == 0) {
		        count = 1;
		        break;
		      }
		    }

		    if (count==0)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}


