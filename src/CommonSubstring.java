//MUST use array of characters and loops
//do NOT use Collections (ArrayList, LinkedList, or contains)
import java.util.Scanner;
public class CommonSubstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text1 = ");
        String text1 = scanner.nextLine();

        System.out.print("Enter text2 = ");
        String text2 = scanner.nextLine();

        System.out.println("\nInput: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"" );
        System.out.println("Output: " + longestCommonSubsequence(text1, text2));

    }

    public static String longestCommonSubsequence(String text1, String text2)
    {
        int text1Length = text1.length();
        int text2Length = text2.length();

        int[][] current = new int[text1Length + 1][text2Length + 1];

        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= text1Length; i++) {
            for (int j = 1; j <= text2Length; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    current[i][j] = current[i - 1][j - 1] + 1;

                    if (current[i][j] > maxLength) {
                        maxLength = current[i][j];
                        endIndex = i - 1;
                    }
                } else {
                    current[i][j] = 0;
                }
            }
        }

        if (maxLength == 0) {
            return "";
        } else {
            return text1.substring(endIndex - maxLength + 1, endIndex + 1);
        }
    }
}