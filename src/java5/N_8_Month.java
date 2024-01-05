package java5;

import java.util.Scanner;

public class N_8_Month {
//	Monthクラスを作成後、
//	月を引数で受け取るとその月の日数を返すメソッドを作成せよ。（２月は28日としてよい）
//	mainメソッドで月を入力させ、その月の日数を表示する。
//	実行例
//	月を入力してください>11
//	11月の日数は30日です。
	
	public static void main(String[] args) {
		System.out.print("月を入力してください>");
		int month = new Scanner(System.in).nextInt();
		
		int day = getMonthOfDay(month);
		System.out.printf("%d月の日数は%d日です。", month, day);
	}
	
	public static int getMonthOfDay(int month) {
		int day = 0;
		switch(month) {
			case 2:
				day = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			default:
				day = 31;
			
		}
		
		return day;
	}
}
