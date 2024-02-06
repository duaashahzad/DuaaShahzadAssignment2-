//extend each of the sorting algorithm classes

public class BubbleSortSortingAlgorithms implements SortingAlgorithm
{
    public int[] sorty (int[] input)
    {
        int arraySize = input.length;

        for(int i = 0; i < arraySize - 1; i++)
        {
            for(int j = 0; j < arraySize - i - 1; j++)
            {
                if(input[j] > input[j+1])
                {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }

}
