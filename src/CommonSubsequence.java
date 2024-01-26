//MUST use array of characters and loops
//do NOT use Collections (ArrayList, LinkedList, or contains)
import java.util.Scanner;
public class CommonSubsequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text1 = ");
        String text1 = scanner.nextLine();

        System.out.print("Enter text2 = ");
        String text2 = scanner.nextLine();

        System.out.println("\nInput: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"" );
        System.out.println("Output: " + longestCommonSubsequence(text1, text2));

    }

    public static int longestCommonSubsequence(String text1, String text2)
    {
        int text1Length = text1.length();
        int text2Length = text2.length();

        //2D array to store lcs lengths
        int[][] current = new int[text1Length + 1][text2Length + 1];

        //put lcs lengths in array
        for(int i = 1; i <= text1Length; i++)
        {
            for(int j = 1; j <= text2Length; j++) {

                //characters match
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {

                    //extends lcs from previous diagonal cell and add 1
                    current[i][j] = current[i - 1][j - 1] + 1;

                    //characters do not match
                } else {

                    //take max of lcs lengths from either characters
                    current[i][j] = Math.max(current[i - 1][j], current[i][j - 1]);
                }
            }
        }

        return current[text1Length][text2Length];
    }


}