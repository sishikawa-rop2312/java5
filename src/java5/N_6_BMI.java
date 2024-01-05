package java5;

import java.util.Scanner;

public class N_6_BMI {
//	BMIクラスを作成する。
//	BMIクラスの中に身長(cm)と体重(kg)を受け取るとBMIを返却する以下のメソッドを作成する
//	public static double getBMI(double heightCm,double weightKg){
//	~計算する処理を書く
//	}
//	​
//	mainメソッドからgetBMIメソッドを呼び出す以下のアプリを作成する。詳しくは実行例を参照のこと
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
		
		double bmi = getBMI(heightCm, weightKg);
		
		System.out.printf("あなたのBMIは%.2fです。", bmi);
		
	}
	
	public static double getBMI(double heightCm, double weightKg) {
		double heightM = heightCm / 100;
		double bmi = weightKg / (heightM * heightM);
		
		return bmi;
	}
}
