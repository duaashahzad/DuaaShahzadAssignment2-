import java.io.FileWriter;
import java.io.IOException;

//FileWriter
public class Performance
{
    public static void main (String[] args)
    {
        //Tester test;

        int[] input = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

        SortingAlgorithm[] sortingAlgorithm = {

                new BubbleSortSortingAlgorithms(),
                new InsertionSortSortingAlgorithms(),
                new SelectionSortSortingAlgorithms(),
                new ShellSortSortingAlgorithms(),
                new QuickSortSortingAlgorithms(),
                new MergeSortSortingAlgorithms(),

                /*new InsertionSortSortingAlgorithms(),
                new QuickSortSortingAlgorithms(),
                new MergeSortSortingAlgorithms(),
                new ShellSortSortingAlgorithms(),
                new SelectionSortSortingAlgorithms(),
                new InsertionSortSortingAlgorithms(),
                new BubbleSortSortingAlgorithms(),*/
        };

        /*
        test = new Tester(BubbleSort);
        test = new Tester(InsertionSort);
        test = new Tester(MergeSort);
        test = new Tester(QuickSort);
        test = new Tester(SelectionSort);
        test = new Tester(ShellSort);
        */

        try(FileWriter writer = new FileWriter("Performance.txt")) {
            for (SortingAlgorithm algorithm : sortingAlgorithm) {
                System.out.println("\n\nSorting algorithm - " + algorithm.getClass());
                writer.write("\n\nSorting algorithm - " + algorithm.getClass());

                Tester test = new Tester(algorithm);

                //for(int i = 0; i < input.length; i++)
                for(int i : input)
                {
                    //int[]kSortedArray = test.generateKSorted(new int[i]);

                   // double time = test.singleTest(i);
                   //test.test(20, input[i]);
                    test.test(20, i);
                    writer.write("\n Sorted " + i + " elements in " + test.test2(20, i) + " ms (avg)");
                   // writer.write("Sorted " + i + " K-sorted elements in " + time);
                }
            }

           // writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
