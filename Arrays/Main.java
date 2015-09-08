package Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.sum(new int[]{1, 2, 3}));
        System.out.println("n = " + Arrays.toString(new int[]{3, 4, 5, 6, 7}));
        System.out.println(Arrays.toString(Arrays.addN(new int[]{3, 4, 5, 6, 7}, 2)));

        System.out.println(Arrays.toString(Arrays.reverse(new int[]{3, 4, 5, 6, 7})));
        Arrays.replaceAll(new int[]{3, 4, 5, 5, 5}, 5, 1);
        System.out.println(Arrays.toString(Arrays.sort(new int[]{6, 4, 19, 3, 20})));
        System.out.println(Arrays.hasSubsequence(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4}));

        System.out.println(Arrays.toString(Arrays.absDif(new int[]{1, 2, 3, 4, 5},
                new int[]{1, 1, 1, 1, 1})));
    }
}
