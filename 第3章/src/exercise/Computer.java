package exercise;

public class Computer {
	private String name;
	private int cores;
	public Computer(String name, int cores) {
		super();
		this.name = name;
		this.cores = cores;
	}
	public Computer(String name) {
		this(name, 32);
	}
	public Computer() {
		this("M200", 32);
	}
}
