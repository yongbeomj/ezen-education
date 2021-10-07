package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {

		Integer[] array = {10 , 3 , 5 , 6 , 1};
		
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Arrays.sort(array, Collections.reverseOrder());
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	
	}
	
}
