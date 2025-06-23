public class MaxAppearingElement {
    static int maxAppearingElement(int[] L, int[] R) {
        int max = 0;
        for (int i = 0; i < L.length; i++) {
            if (R[i] > max) max = R[i];
        }
        int[] freq = new int[max + 2];
        for (int i = 0; i < L.length; i++) {
            freq[L[i]] += 1;
            freq[R[i] + 1] -= 1;
        }
        int maxFreq = freq[0];
        int res = 0;
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] L = {1, 2, 3};
        int[] R = {3, 5, 4};
        System.out.println(maxAppearingElement(L, R));
    }
}
