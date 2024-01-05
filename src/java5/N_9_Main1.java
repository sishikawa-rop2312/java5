package java5;

import java.util.Scanner;

public class N_9_Main1 {
//	Main1クラス作成後、
//	引数で整数を受け取り、それが偶数かどうかをbooleanで返すメソッドを作成せよ。
//	またそれを利用して以下の処理を実現せよ。
//	実行例
//	整数>11
//	11は奇数です
//	
	public static void main(String[] args) {
		System.out.print("整数>");
		int num = new Scanner(System.in).nextInt();
		String strOddEven;
		
		if (isEven(num)) {
			strOddEven = "偶数";
		} else {
			strOddEven = "奇数";
		}
		System.out.printf("%dは%sです", num, strOddEven);
	}
	
	public static boolean isEven(int num) {
		boolean isEven = false;
		
		if (num % 2 == 0) {
			isEven = true;
		}
		
		return isEven;
	}
}
