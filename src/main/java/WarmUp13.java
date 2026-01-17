/*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
Examples:
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([], []) → 0
*/

public class WarmUp13 extends BaseClass {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 3};
        int actual = start1(a, b);
        isTestPassed(actual, 2);

        int[] a1 = {7, 2, 3};
        int[] b1 = {1};
        int actual1 = start1(a1, b1);
        isTestPassed(actual1, 1);

        int[] a2 = {1, 2};
        int[] b2 = {};
        int actual2 = start1(a2, b2);
        isTestPassed(actual2, 1);

        int[] a3 = {};
        int[] b3 = {};
        int actual3 = start1(a3, b3);
        isTestPassed(actual3, 0);
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            if (b.length == 0) {
                count = 1;
            }
            if (b.length > 0 && b[0] == 1) {
                count = 2;
            }
            if (b.length > 0 && b[0] != 1) {
                count = 1;
            }
        }
        if (a.length > 0 && a[0] != 1) {
            if (b.length > 0 && b[0] == 1) {
                count = 1;
            }
        }
        if (a.length == 0) {
            if (b.length > 0 && b[0] == 1) {
                count = 1;
            }
        }
        return count;
    }

    //independent control implementation. cleaner version. here nested ifs are avoided.
    // a dizisinin 1 ile başlayıp başlamaması, b dizisinin sonucunu etkilemez.
    // Her iki dizi de koşulu sağlıyorsa count birer kez artar ve sonuç doğal olarak 2 olur.
    // Biri sağlıyorsa 1, hiçbiri sağlamıyorsa 0 döner.

//    public int start1(int[] a, int[] b) {
//        int count = 0;
//
//        // a dizisini kendi içinde kontrol et
//        if (a.length > 0 && a[0] == 1) {
//            count++;
//        }
//
//        // b dizisini kendi içinde kontrol et
//        if (b.length > 0 && b[0] == 1) {
//            count++;
//        }
//
//        return count;
//    }

}
