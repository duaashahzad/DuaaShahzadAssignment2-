public class SelectionSortSortingAlgorithms implements SortingAlgorithm{



    public int[] sorty(int[] input) {
        {
            int i = 0;
            int j = 0;
            int indexSmallest = 0;
            int temp = 0;

            int arraySize = input.length;

            for (i = 0; i < arraySize - 1; i++) {
                indexSmallest = i;

                for (j = i + 1; j < arraySize; j++) {
                    if (input[j] < input[indexSmallest]) {
                        indexSmallest = j;
                    }
                }

                temp = input[i];
                input[i] = input[indexSmallest];
                input[indexSmallest] = temp;
            }
        }

        return input;
    }
}
