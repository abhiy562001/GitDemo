package StaticAndNonStaticConcept;

public class Calculation {

	public Calculation() {//[3] --Cunstructer
		System.out.println("this is Construter");
	}

	static { // [1] -----Static block
		System.out.println("this is 1st Static block");
		int c = 23; // --local variable of this staticblock
	}

	{ // [2]--after creating object of the current class first it will be execute that non-static block then it will 
		//-----execute constructer
		System.out.println("this is 1st non-static block");
	}

	int a = 10; // --global variable ( non - static variable
	int b = 20; // --it is also global variable (non - static variable)

	public static void main(String[] args) {
		new Calculation().Sum();//--[2]
	}

	public void Sum() {
		System.out.println("this is 1st nonstatic method");
		System.out.println(this.a + this.b);
	}

	public static void Multiply(int a, int b) {
		System.out.println("this is 1st static m ethd");
	}
}
