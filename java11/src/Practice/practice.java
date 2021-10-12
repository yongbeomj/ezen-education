package Practice;

import java.util.Arrays;
import java.util.Collections;

public class practice {
	
	
	
	public static void main(String[] args) {

		
		Integer[] array = {10 , 3 , 5 , 6 , 1};
		sort1(array);
		System.out.println();
		sort2(array);
		
	
	}
	
	
	static void sort1(Integer[] array) {
		Arrays.sort(array);
		for(int i = 0; i<array.length; i++) {
			System.out.print( array[i] + " ");
		}
		
	}
	static void sort2(Integer[] array) {
		Arrays.sort(array, Collections.reverseOrder());
		for(int i = 0; i<array.length; i++) {
			System.out.print( array[i] + " ");
		}
	}
	
}
