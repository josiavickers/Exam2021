package task1Josia;

public abstract class DataCollection {
	private int[] data;
	
	public DataCollection(int[] data) {
		this.data = data;
	}
	
	public int numberOfValues() {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			count++;
		}
		return count;
	}
	
	public int get(int index) {
		return data[index];
	}
}
