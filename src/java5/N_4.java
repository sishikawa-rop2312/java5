package java5;

import java.util.Scanner;

public class N_4 {
//	引数でintの値を3つ受け取ると、その中の最大値を返却するメソッドを作成する。
//	mainメソッドにて整数を３つ受け取り、最大値を求める処理を作成せよ。
//	実行例
//	整数1を入れてください。>3
//	整数2を入れてください。>10
//	整数3を入れてください。>4
//	3つの整数値の最大は10です。
	
	public static void main(String[] args) {
		System.out.print("整数1を入れてください。>");
		int num1 = new Scanner(System.in).nextInt();
		
		System.out.print("整数2を入れてください。>");
		int num2 = new Scanner(System.in).nextInt();
		
		System.out.print("整数3を入れてください。>");
		int num3 = new Scanner(System.in).nextInt();
		
		int max = calcMax(num1, num2, num3);
		System.out.printf("3つの整数値の最大は%dです。", max);
	}
	
	public static int calcMax(int num1, int num2, int num3) {
        int max = Math.max(Math.max(num1, num2), num3);
        
		return max;
	}
}
