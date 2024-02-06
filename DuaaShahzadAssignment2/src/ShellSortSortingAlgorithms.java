public class ShellSortSortingAlgorithms implements SortingAlgorithm {


    public int[] sorty(int[] input) {
        {
            int arraySize = input.length;

            for (int gap = arraySize / 2; gap > 0; gap /= 2) {
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
}
