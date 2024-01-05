package java5;

import java.util.Scanner;

public class N_5 {
//	引数でintの値を1つ受け取ると、１からその値までの和を求め返却するメソッドを作成する。
//	mainメソッドにて整数を1つ受け取り、和を求める処理を作成せよ。
//	実行例
//	1からいくつまで足しますか>10
//	1から10までの和は55です。
	
	public static void main(String[] args) {
		System.out.print("1からいくつまで足しますか>");
		int num = new Scanner(System.in).nextInt();
		
		int sum = calcSum(num);
		System.out.printf("1から%dまでの和は%dです。\n", num, sum);
	}
	
	public static int calcSum(int num) {
		int sum = 0;       
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		return sum;
	}
}
