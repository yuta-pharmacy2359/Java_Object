package sample;

import java.time.LocalDate;

public class ExecProduct {

	public static void main(String[] args) {
		Product p1 = new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true);
		int quantity = 5;
		System.out.println("商品名=" + p1.getName());
		System.out.println("個数=" + quantity);
		System.out.println("総額=" + p1.totalPrice(quantity));
		System.out.println("1000円よりも高いか=" + p1.isHighPrice(1000));
	}

}