package task1Josia;

public class Main {
	private Temperatures t;
	
	public Main(int[] data) {
		t = new Temperatures(data);
	}
	
	public int getMax() {
		return t.max();
	}
	
	public double getMean() {
		return t.mean();
	}
	
	public static void main(String[] args) {
		int data[] = {3, 4, 6, 4, 3};
		Main m = new Main(data);
		System.out.println("Max: " + m.getMax());
		System.out.println();
		System.out.println("Mean: " + m.getMean());
	}

}
