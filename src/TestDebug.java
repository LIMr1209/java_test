public class TestDebug {
    public static void main(String[] args) {
        int i;
        int[] a = {16, 12, 27, 11, 13, 23};
        s(a, 6);
        for (i = 0; i < a.length; i++) System.out.println(a[i] + " ");
    }

    static void s(int[] b, int k) {
        int i, j, t;
        for (i = 1; i < k; i++) {
            for (t = b[i], j = i - 1; j >= 0 && t > b[j]; j--) {
                b[j + 1] = b[j];
            }
            b[j + 1] = t;
        }
    }
}
