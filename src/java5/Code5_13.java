package java5;

import java.util.Arrays;

public class Code5_13 {

	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int array[] = {1, 2, 3};
		incArray(array);
		System.out.println(Arrays.toString(array));
	}

}
