public class Main {

    static int precomputedSum = 0;
    static boolean isPrecomputed = false;

    static void precomputeSum(int[] a) {
        if (!isPrecomputed) {
            for (int i = 1; i < a.length; ++i) {
                precomputedSum += a[i] - a[i - 1];
            }
            isPrecomputed = true;
        }
    }

    static int g1(int[] a) {
        precomputeSum(a);
        return precomputedSum;
    }

    public static void main(String[] args) {
        int[] a = {3, 8, 12, 15, 18};
        int answer = g1(a);
        System.out.println("Result: " + answer); // 15
    }
}
