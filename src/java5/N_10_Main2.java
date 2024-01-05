package java5;

import java.util.Scanner;

public class N_10_Main2 {
//	Main2クラス作成後、
//	引数で文字列と整数を受け取り、その文字を整数個並べた文字列を返却するメソッドを作成する。
//	またそれを利用して以下の処理を実現せよ。
//	実行例
//	繰り返す文字>Hello
//	繰り返す回数>5
//	HelloHelloHelloHelloHello

	public static void main(String[] args) {
		System.out.print("繰り返す文字>");
		String text = new Scanner(System.in).nextLine();
		
		System.out.print("繰り返す回数>");
		int num = new Scanner(System.in).nextInt();
		
		System.out.printf("%s", repeatText(text, num));
	}
	
	public static String repeatText(String text, int num) {
		String repeatText = "";
		for (int i = 0; i < num; i++) {
			repeatText += text;
		}
		
		return repeatText;
	}
}
