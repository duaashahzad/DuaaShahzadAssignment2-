public class QuickSortSortingAlgorithms implements SortingAlgorithm
{

    public int[] sorty(int[] input){
        quickSort(input, 0, input.length - 1);
        return input;
    }


    public static int partition(int[] array, int start, int end)
    {
        int midpoint = start + (end - start) / 2;
        int pivot = array[midpoint];

        boolean done = false;
        while (!done)
        {
            while (array[start] < pivot)
            {
                start ++;
            }

            while (pivot < array[end])
            {
                end--;
            }

            if(start >= end)
            {
                done = true;
            }
            else
            {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                start++;
                end--;
            }
        }

        return end;
    }

    public static void quickSort(int[] array, int lowIndex, int highIndex)
    {
        if(lowIndex >= highIndex) {
            return ;
        }

        int lowEndIndex = partition(array, lowIndex, highIndex);
        quickSort(array, lowIndex, lowEndIndex);
        quickSort(array, lowEndIndex + 1, highIndex);


    }

}
