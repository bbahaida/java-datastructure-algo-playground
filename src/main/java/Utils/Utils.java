package Utils;

public class Utils {
    public static void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void swap(double[] arr, int i, int j) {
        if (i == j) return;
        double temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
