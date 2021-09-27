package practice;

public class Bigfoot {
	int n;
	double x;
	public Bigfoot(int n, double x) {
		this.n = n; this.x = x;
	}
	public Bigfoot(int n) {
		this(n, n);
	}
	public Bigfoot(double x) {
		// this(x, 5);
	}
}
// コンパイルエラー(Bigfoot(double, int)は定義されていない)