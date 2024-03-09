package StringConcept;

public class Demo {

	public static String str = "Hello sir";

	public static void main(String[] args) {
//		trim(str);
//		split(str);
//		subString(str);
//		toCharArray(str);
//		charAt(str);
		compareTo(str);

	}

	public static void Lowercase(String str) {
		String lowercase = str.toLowerCase();
		System.out.println(lowercase);

	}

	public static void Uppercase(String str) {
		String lowercase = str.toUpperCase();
		System.out.println(lowercase);

	}

	public static void trim(String str) {
		String value = str.trim();
		System.out.println(value);
	}

	public static void split(String str) {
		String[] strArr = str.split(" ");
		for (String value : strArr) {
			System.out.println(value);
		}
	}

	public static void toCharArray(String str) {
		char[] ch = str.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
	}

	public static void subString(String str) {
		String value1 = str.substring(2);
		System.out.println(value1);

		String value2 = str.substring(2, 5);
		System.out.println(value2);

	}

	public static void length(String str) {
		int length = str.length();
		System.out.println(length);
	}

	public static void charAt(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}

	}

	public static void compareTo(String str) {
		int status = str.compareTo("Hello");
		System.out.println(status);
	}

	public static void compareToIgnoreCase(String str) {

		int status = str.compareToIgnoreCase("Hello");
		System.out.println(status);
	}

	public static boolean equals(String str) {
		boolean status = str.equals("Hello");
		return status;
	}

	public static boolean equalIgnoreCase() {
		boolean status = str.equals("hello");
		return status;
	}

	public static void concat(String str) {
		String value = str.concat("My Friend");
		System.out.println(value);
	}

	public static boolean contains(String str) {
		boolean status = str.contains("Friend");
		return status;
	}

	public static boolean contentEquals(String str) {
		boolean status = str.contentEquals("Hello");
		return status;
	}

	public static boolean endsWith(String str) {
		boolean status = str.endsWith(str);
		return status;
	}

	public static void format(String str) {
		String value = str.format(str, "Sir");
		System.out.println(value);
	}

	public static void getChars(String str) {
		str.getChars(0, 0, null, 0);
	}

	public static void indexOf(String str) {
		int value1 = str.indexOf(str);
		int value2 = str.indexOf(15);
		System.out.println(value1);
		System.out.println(value2);

	}

	public static boolean isEmpty(String str) {
		boolean status = str.isEmpty();
		return status;
	}

	public static void lastIndexOf(String str) {
		int index = str.lastIndexOf(str);
		System.out.println(index);
	}

	public static void replace(String str) {
		String value = str.replace('B', 'C');
		System.out.println(value);
	}

	public static void replaceAll(String str) {
		String value = str.replaceAll("Hello", "This is");
		System.out.println(value);
	}

	public static boolean startsWith(String str) {
		boolean status = str.startsWith("H");
		return status;
	}

	public static void ToString(String str) {
		String value = str.toString();
		System.out.println(value);
	}

	public static void valueOF(String str) {
		String value = str.valueOf("Hello");
		System.out.println(value);
	}

	public static boolean IsBlanked(String str) {
		boolean status = str.isBlank();
		return status;
	}

}
