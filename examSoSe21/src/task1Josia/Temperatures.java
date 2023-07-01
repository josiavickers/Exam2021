package task1Josia;

public class Temperatures extends DataCollection implements CollectionProperties{

	public Temperatures(int[] data) {
		super(data);
	}

	@Override
	public int max() {
		int max = get(0);
		for (int i = 0; i < numberOfValues(); i++) {
			if (get(i) > max) {
				max = get(i);
			}
		}
		
		return max;
	}

	@Override
	public double mean() {
		int sum = 0;
		for (int i = 0; i < numberOfValues(); i++) {
			sum += get(i);
		}
		double mean = sum / numberOfValues();
		
		return mean;
	}

}
