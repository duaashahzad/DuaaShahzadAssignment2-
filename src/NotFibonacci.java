import java.util.Scanner;
import java.math.BigInteger;

public class NotFibonacci {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the sequence: ");
        int numberOfTerms = scanner.nextInt();

        notFibonacci(numberOfTerms);


    }

    public static BigInteger[] notFibonacci(int numberOfTerms)
    {
        BigInteger[] sequence = new BigInteger[numberOfTerms];
        sequence[0] = BigInteger.ZERO;
        sequence[1] = BigInteger.ONE;

        System.out.print("NotFibonacci Sequence: ");

        for(int i = 0; i < numberOfTerms; i++)
        {
            // Check if there are enough terms left to calculate the next one
            System.out.print(sequence[i] + " ");
            if( i < numberOfTerms -2 )
            {
                // Multiply previous term by 3, add twice the term before that
                sequence[i+2] = sequence[i+1].multiply(BigInteger.valueOf(2)).add(sequence[i].multiply(BigInteger.valueOf(3)));

            }
        }

        return sequence;
    }
}