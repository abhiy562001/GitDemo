package CollectionFramework;

import java.util.ArrayList;

public class ListConcept {

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<Double>();
		list.add(23.5);
		list.add(22.5);
		list.add(21.5);
		list.add(28.5);

		getMinimumValue(list);
		getMaximumValue(list);
	}

	public static void getMaximumValue(ArrayList<Double> list) {
		double max = list.get(0);

		for (Double value : list) {
			if (value > max) {
				max = value;
			}
		}
		System.out.println(max);
	}

	public static void getMinimumValue(ArrayList<Double> list) {

		double min = list.get(0);

		for (Double value : list) {
			if (value < min) {
				min = value;
			}
		}
		System.out.println(min);
	}

}
