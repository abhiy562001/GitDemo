package ReturnTypeConcept;

public class Demo {

	public Demo() {//--without parameterised cunstructer

	}

	public Demo(String str) { //--parameterised cunstructer

	}

	static int a = 11;
	static int b = 25;

	public static void main(String[] args) {
		int resultofsum = Sum(a, b);
		int resultofMultiply = Multiply(resultofsum, resultofsum);
		System.out.println(resultofMultiply);

	}

	public static int Sum(int a, int b) {
		return a + b;
	}

	public static int Multiply(int c, int d) {
		return c * d;
	}

}
