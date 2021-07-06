package zohoTest;

public class ZohoTestMainClass {

	public static void main(String args[]) {
		String input1 = "WELCOME";
		String input2 = "WATER";
		drawPattern(input1);
		drawPattern(input2);
	}

	public static void drawPattern(String word) {
		String pattern = "";
		String stringArr[] = word.split("");
		int middleIndex = word.length() / 2;
		System.out.println("Input: " + word);
		System.out.println("Output: ");
		for (int i = middleIndex; i < word.length(); i++) {
			pattern += stringArr[i];
			System.out.println(pattern);
		}
		for (int i = 0; i < middleIndex; i++) {
			pattern += stringArr[i];
			System.out.println(pattern);
		}
		System.out.println();
	}

}
