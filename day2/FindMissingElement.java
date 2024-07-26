package myAssignments.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1, 4,3,2,8,6, 7};
		
  Arrays.sort(array);
  for(int i=0; i<array.length; i++) {
 
   int j=i+1;
   
   if(j!=array[i]) {
	   System.out.println("Missed value is : "+j);
	   break;
   }
   }

}
	

}
