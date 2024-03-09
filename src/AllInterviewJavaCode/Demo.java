package AllInterviewJavaCode;

public class Demo {

	public static void main(String[] args) {
//		reverse(124);
		int arr[] = { 2, 4, 6, 2, 4 };
//		boolean value = EvenOdd(126);
//		System.out.println(value);
//		Pallindrone(127);
//		FindDuplicate(arr);
//		Lucas(5);
//		FabbonicciSeries(4);
//		MaximumNumber(arr);
//		MinimumNumber(arr);
		factorial(6);

	}

	public static void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void primeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("prime number");
			} else {
				System.out.println("not prime number");
			}
		}
	}

	public static int reverse(int num) {
		int rem;
		int rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println(rev);
		return rev;
	}

	public static boolean EvenOdd(int num) {
		if (num % 2 == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static void MaximumNumber(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}

	public static void MinimumNumber(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	public static void AssendingOrder(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void DescendingOrder(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void Pallindrone(int num) {
		int reverse = reverse(num);
		int value = num;
		if (reverse == num) {
			System.out.println("pallindrone");
		} else {
			System.out.println("Not pallindrone");

		}
	}

	public static void FindDuplicate(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void ArmStrongNumber(int num) {
		int rem, sum = 0;
		for (int i = 0; num < 0; i++) {
			rem = num % 10;
			sum = sum + (rem * rem);
			num = num / 10;
		}

		System.out.println(sum);
	}

	public static void FabbonicciSeries(int num) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a + " " + b + " ");

		for (int i = 0; i < num; i++) {
			c = b + a;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}

	public static void Lucas(int num) {
		int a = 0;
		int b = 1;
		int c = 1;
		int d;
		System.out.print(a + " " + b + " " + c + " ");

		for (int i = 0; i < num; i++) {
			d = a + b + c;
			a = b;// 1 2
			b = c;// 1 2
			c = d;// 2 4

			System.out.print(d + " ");
		}
	}

	public static void HCF(int a, int b) {

	}

	public static void LCM() {

	}

	public static void CountNumber(int num) {
		int count = 0;
		for (int i = 0; num > 0; i++) {
			count++;
			num = num / 10;
		}

		System.out.println("size of Num  :-" + count);
	}

}
