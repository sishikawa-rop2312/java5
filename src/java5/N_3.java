package java5;

import java.util.Scanner;

public class N_3 {
//	引数でintの値を受け取るとそれを３乗した値を返すメソッドを作成する。
//	mainメソッドで数値を一つ入力させ、実行例のようになるようにせよ。
//	実行例
//	整数を入れてください。>17
//	17を３乗すると4913です
	public static void main(String[] args) {
		System.out.print("整数を入れてください。>");
		int num = new Scanner(System.in).nextInt();
		int cubed = calcCubed(num);
		System.out.printf("%dを３乗すると%dです", num, cubed);
	}
	
	public static int calcCubed(int num) {
        // 3乗する
        int cubed = (int) Math.pow(num, 3);
        
		return cubed;
	}
}
