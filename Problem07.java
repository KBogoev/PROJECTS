import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input some words separated by intervals: ");

		String words = sc.nextLine();
		int wordCount = 1;
		int maxLetters = 0;
		int lettersPerWord = 0;

		for (int index = 0; index < words.length(); index++) {

			if (words.charAt(index) == ' ') {

				wordCount++;
				if (lettersPerWord > maxLetters) {

					maxLetters = lettersPerWord;
				}

				lettersPerWord = 0;
			} else {

				lettersPerWord++;
			}
		}

		System.out.println("Longest word has " + maxLetters + " letters and the count of words is: " + wordCount);
	}
}
