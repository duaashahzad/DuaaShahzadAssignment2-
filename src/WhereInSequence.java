import java.util.Scanner;
import java.math.BigInteger;

//for number 6, writeFile and put the code and put the time complexity
//then explain in a paragraph format what's happening

public class WhereInSequence {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the sequence: ");
        int numberOfTerms = scanner.nextInt();

        BigInteger[] sequence = notFibonacci(numberOfTerms);

        System.out.print("\n\nInput: ");
        BigInteger input = scanner.nextBigInteger();

        int output = whereInSequence(sequence, input);
        System.out.println("Output: " + output);
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

    public static int whereInSequence(BigInteger[] sequence, BigInteger input )
    {
        int closestNumber = 0;

        for(int i = 0; i < sequence.length; i++)
        {
            if(sequence[i].compareTo(input) == 0) //equals
            {
                return i+1;
            }
            else if(sequence[i].compareTo(input) < 0) //is less than
            {
                closestNumber = i+1;
            }
            else
            {

            }
        }

        return closestNumber;
    }





}