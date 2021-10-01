package practice;

public class ExecCircle {

	public static void main(String[] args) {
		Circle cir = new Circle("blue", 5.5);
		System.out.println("色 = " + cir.getColor());
		System.out.println("半径 = " + cir.getRadius());
		System.out.printf("面積 =%6.2f", cir.area());
	}

}
