
import java.util.Scanner;

public class R1B {

    public static int countWords(int k, String[] words, int n, int m) {
        int lineCount = 0; // number of lines used
        int wordCount = 0; // number of words placed
        int currentLineLength = 0; // current line length used

        for (String word : words) {
            int wordLength = word.length();

            // check if the word can fit in the current line
            if (currentLineLength == 0) { // if the line is empty
                if (wordLength <= m) {
                    currentLineLength = wordLength;
                    wordCount++;
                }
            } else if (currentLineLength + 1 + wordLength <= m) { // include space before adding word
                currentLineLength += 1 + wordLength;
                wordCount++;
            } else {  // move to the next line
                lineCount++;
                if (lineCount == n) {  // stop if all lines are used
                    break;
                }
                // start a new line with the current word if it fits
                currentLineLength = (wordLength <= m) ? wordLength : 0;
                if (currentLineLength > 0) {
                    wordCount++;
                }
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input number of words
        int k = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] words = new String[k];

        // input words
        for (int i = 0; i < k; i++) {
            words[i] = sc.nextLine();
        }

        // input N and M
        int n = sc.nextInt();
        int m = sc.nextInt();

        // print the maximum number of words that can be placed
        System.out.println(countWords(k, words, n, m));
    }
}
