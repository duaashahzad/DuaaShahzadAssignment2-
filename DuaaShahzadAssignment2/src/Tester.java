import java.util.Random;

public class Tester {

    private SortingAlgorithm sortingAlgorithm;

    public Tester(SortingAlgorithm sa)
    {
        this.sortingAlgorithm = sa;
    }

    public double singleTest(int size)
    {
        int[] array = new int[size];
        Random random = new Random();

        for(int i = 0; i < size; i++)
        {
            array[i] = random.nextInt();
        }

        //activates kSorting
        array = generateKSorted(array);


        long startTime = System.nanoTime();
        sortingAlgorithm.sorty(array);
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000.0;
    }

    public void test(int iterations, int size)
    {
        double total = 0;
        double avg = 0;


        for(int i = 0; i < iterations; i++)
        {
            total += singleTest(size);

        }

        avg = total/iterations;

        System.out.println("Sorted " + size + " elements in " + avg + " ms (avg)");
    }

    public double test2(int iterations, int size)
    {
        double total = 0;
        double avg = 0;


        for(int i = 0; i < iterations; i++)
        {
            total += singleTest(size);

        }

        avg = total/iterations;

        return avg;
    }

    public int[] generateKSorted(int[] input)
    {
        int arraySize = input.length;

        for (int gap = 10; gap < arraySize; gap++) {

            for (int i = gap; i < arraySize; i += 1) {
                int temp = input[i];

                int j;

                for (j = i; j >= gap && temp < input[j - gap]; j -= gap) {
                    input[j] = input[j - gap];
                }
                input[j] = temp;

            }

        }
        return input;
    }

}
