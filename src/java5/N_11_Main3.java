package java5;

import java.util.Arrays;
import java.util.Scanner;

public class N_11_Main3 {
//	Main3クラス作成後、
//	引数でint型の配列を受け取り、その配列の要素を２倍にするメソッドを作成せよ。
//	そのメソッド使用し以下の処理を実現せよ。
//	実行例
//	要素数>3
//	要素0>3
//	要素1>5
//	要素2>10
//	要素を２倍にしました。
//	{6,10,20,}
	public static void main(String[] args) {
		System.out.print("要素数>");
		int num = new Scanner(System.in).nextInt();
		
		int[] array = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.printf("要素%d>", i);
			array[i] = new Scanner(System.in).nextInt();
		}
		
		twiceArray(array);
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void twiceArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] *= 2;
		}
	}
}
