package java5;

public class R5_3 {
	public static void main(String[] args) {
		email("メールタイトル", "hoge@gmail.com", "メール本文");
		
		email("hoge@gmail.com", "メール本文");
	}

	public static void email(String title, String address, String text) {
		System.out.printf("%sに、以下のメールを送信しました\n件名：%s\n本文：%s\n\n", address, title, text);
	}
	
	public static void email(String address, String text) {
		System.out.printf("%sに、以下のメールを送信しました\n件名：無題\n本文：%s\n", address, text);
	}
}
