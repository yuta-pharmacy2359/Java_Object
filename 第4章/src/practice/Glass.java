package practice;

public class Glass {
	private int number = 100;
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static void main(String[] args) {
		Glass g1, g2;
		g1 = new Glass();
		g2 = g1;
		g2.setNumber(200);
		System.out.println(g1.getNumber());
	}

}
