public class MergeSortSortingAlgorithms implements SortingAlgorithm
{

    public int[] sorty(int[] input){
        mergeSort(input, 0, input.length - 1);
        return input;
    }

    public static void merge(int[] array, int leftFirst, int leftLast, int rightLast)
    {
        int mergedSize = rightLast - leftFirst + 1;
        int leftPos = 0;
        int rightPos = 0;
        int mergePos = 0;

        int[] mergedNumbers = new int[mergedSize];


        leftPos = leftFirst;
        rightPos = leftLast + 1;

        while(leftPos <= leftLast && rightPos <= rightLast)
        {
            if(array[leftPos] <= array[rightPos])
            {
                mergedNumbers[mergePos] = array[leftPos];
                leftPos++;
            }
            else
            {
                mergedNumbers[mergePos] = array[rightPos];
                rightPos++;
            }

            mergePos++;
        }

        while(leftPos <= leftLast)
        {
            mergedNumbers[mergePos] = array[leftPos];
            leftPos++;
            mergePos++;
        }

        while(rightPos <= rightLast)
        {
            mergedNumbers[mergePos] = array[rightPos];
            rightPos++;
            mergePos++;
        }

        for(mergePos = 0; mergePos < mergedNumbers.length; mergePos++)
        {
            array[leftFirst + mergePos] = mergedNumbers[mergePos];
        }

    }


    public static void mergeSort(int[] array, int i, int k)
    {
        int j = 0;

        if(i < k)
        {
            j = (i + k) / 2;

            mergeSort(array, i, j);
            mergeSort(array, j+1, k);
            merge(array, i, j, k);

        }
    }
}
