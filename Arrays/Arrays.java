package Arrays;

public class Arrays {
    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = i += arr[i];
        }

        return sum;
    }

    public static String toString(int[] arr) {
        String arrayAsString = "[";

        for (int i = 0; ; i++) {
            arrayAsString += arr[i];
            if (i == arr.length - 1)
                return arrayAsString += "]";
            arrayAsString += ", ";
        }
    }

    public static int[] addN(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }
        return arr;
    }

    public static int[] reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];

        System.arraycopy(arr, 0, reversedArray, 0, arr.length);

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }

        return reversedArray;
    }

    public static void replaceAll(int[] arr, int old, int nw) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == old) {
                arr[i] = nw;
            }
        }
    }

    public static int[] sort(int[] arr) {
        int tmp;
        boolean swapped = true;
        int[] sortedArray = new int[arr.length];

        System.arraycopy(arr, 0, sortedArray, 0, arr.length);

        while (swapped) {
            swapped = false;
            for (int i = 1; i < sortedArray.length; i++) {
                if (sortedArray[i - 1] > sortedArray[i]) {
                    tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i - 1];
                    sortedArray[i - 1] = tmp;
                    swapped = true;
                }
            }
        }
        return sortedArray;
    }

    public static boolean hasSubsequence(int[] arr, int[] sub) {

        for (int i = 0; i <= arr.length - sub.length; i++) {
            boolean hasMatch = true;

            for (int x = 0; x < sub.length; x++) {
                if (sub[x] != arr[i + x]) {
                    hasMatch = false;
                }
            }
            if (hasMatch) {
                return true;
            }
        }
        return false;
    }

    public static int[] absDif(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("The two arrays need to be the same length!");
        }

        int[] absArray = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int anArr2 : arr2) {
                absArray[i] = arr1[i] - anArr2;
            }
        }

        return absArray;
    }
}
