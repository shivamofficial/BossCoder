public class codefile{
    public static int[] build(int[]  input){
         int n = input.length;
        int pivot = -1;

        // Step 1: Find the rightmost pivot (breakpoint)
        for (int i = n - 2; i >= 0; i--) {
            if (input[i] < input[i + 1]) {
                pivot = i;
                break;  // Fixed placement
            }
        }

        // If no pivot, reverse the entire array
        if (pivot == -1) {
            reverse(input, 0, n - 1);
            return input;
        }

        // Step 2: Find the next greater element and swap
        for (int i = n - 1; i > pivot; i--) {
            if (input[i] > input[pivot]) {
                swap(input, i, pivot);
                break;
            }
        }

        // Step 3: Reverse the suffix (right side of pivot)
        reverse(input, pivot + 1, n - 1);
        return input;
    }

    // Function to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to reverse array from index `start` to `end`
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }   
    }
}
