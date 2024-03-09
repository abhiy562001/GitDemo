package SingleAndMultiDimentional_Arrays;

public class Array {

	public static void main(String[] args) {

		int arr[][] = { { 2, 4, 9 }, { 1, 3, 5 }, { 5, 3, 8 } };

//		int min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i][0];

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > min) {
					min = arr[i][j];
				}
			}

			System.out.println(min);

		}

	}
}
