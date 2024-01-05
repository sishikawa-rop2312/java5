package java5;

public class R5_1 {
	public static void main(String[] args) {
		introduceOnsefl();
	}

	public static void introduceOnsefl() {
		String name = "田中";
		int age = 70;
		double height = 170.2;
		char zodiac = '辰';
	
		System.out.printf("名前:%s 年齢:%d 身長:%.1f 干支:%c", name, age, height, zodiac);
	}
}
