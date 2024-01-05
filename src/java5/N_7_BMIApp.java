package java5;

import java.util.Scanner;

public class N_7_BMIApp {
//	BMIAppクラスを作成し、そこからBMIクラスにあるgetBMIメソッドを呼び出し使用せよ。
//	実行結果は問題文６と同一となるようにする。
//	実行例
//	身長を入力してください(cm)>175
//	体重を入力してください(kg)>70
//	あなたのBMIは22.86です。
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("身長を入力してください(cm)>");
		double heightCm = scanner.nextDouble();
		
		System.out.print("体重を入力してください(kg)>");
		double weightKg = scanner.nextDouble();
		
		double bmi = N_6_BMI.getBMI(heightCm, weightKg);
		
		System.out.printf("あなたのBMIは%.2fです。", bmi);
		
	}
}
