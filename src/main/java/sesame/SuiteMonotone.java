package sesame;

import java.util.Arrays;

public class SuiteMonotone {
    public static int[] longestMonotonousSuite(final int[] input) {
        if (input.length <= 0) {
            throw new RuntimeException();
        }
        if (input.length > 2) {
            int startIndex = 0;
            int endIndex = 1;
            boolean ascending = input[startIndex] <= input[endIndex];
            for (int i = 2; i < input.length; i++) {
                if (ascending) {
                    if (input[i - 1] > input[i]) {
                        startIndex = i - 1;
                        ascending = !ascending;
                    }
                    endIndex = i;
                } else {
                    if (input[i - 1] < input[i]) {
                        startIndex = i - 1;
                        ascending = !ascending;
                    }
                    endIndex = i;
                }

            }
            int[] output = new int[endIndex+1];
            for (int i = startIndex; i <= endIndex; i++) {
                output[i] = input[i];
            }
            return output;
        }
        return input;
    }
}
