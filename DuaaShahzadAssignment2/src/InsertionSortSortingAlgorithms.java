public class InsertionSortSortingAlgorithms implements SortingAlgorithm
{
    public int[] sorty (int[] input)
    {
        int i = 0;
        int j = 0;
        int temp = 0;
        int arraySize = input.length;


        for( i = 1; i < arraySize; i++)
        {
            j = i;
            while( j > 0 && input[j] < input[j-1])
            {
                temp = input[j];
                input[j] = input[j-1];
                input[j-1] = temp;
                j--;

            }
        }

        return input;
    }
}
