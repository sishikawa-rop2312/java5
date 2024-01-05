package java5;

public class R5_4 {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println(triangleArea);
		
		double circleArea = calcCircleArea(5.0);
		System.out.println(circleArea);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double triangleArea = (bottom * height) / 2;
		return triangleArea;
	}
	
	public static double calcCircleArea(double radius) {
		double circleArea = radius * radius * 3.14;
		return circleArea;
	}
}
