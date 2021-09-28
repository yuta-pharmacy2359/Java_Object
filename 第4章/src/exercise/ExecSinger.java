package exercise;

public class ExecSinger {

	public static void main(String[] args) {
		Singer jack = new Singer("Jack");
		sub(jack);
		System.out.println(jack.getName());
	}
	public static void sub(Singer singer) {
		// singer.setName("Tom");
	}
}
