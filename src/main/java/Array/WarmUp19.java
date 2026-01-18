package Array;

import BaseClass.BaseClass;

import java.util.Arrays;

/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
the elements from a followed by the elements from b. The arrays may be any length, including 0,
but there will be 2 or more elements available between the 2 arrays.
make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
make2([1, 2], []) → [1, 2]
make2([3], [1]) → [3, 1]
make2([3, 1, 4], []) → [3, 1]
make2([1, 2, 3], [7, 8]) → [1, 2]
 */
public class WarmUp19 extends BaseClass {
    public static void main(String[] args) {
        int[] a1 = {4, 5};
        int[] b1 = {1, 2, 3};
        int[] actual1 = make2(a1, b1);
        int[] expected1 = {4, 5};
        BaseClass.isTestPassed(Arrays.toString(actual1), Arrays.toString(expected1));

        int[] a2 = {4};
        int[] b2 = {1, 2, 3};
        int[] actual2 = make2(a2, b2);
        int[] expected2 = {4, 1};
        BaseClass.isTestPassed(Arrays.toString(actual2), Arrays.toString(expected2));
    }

    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int count = 0;
        // Önce A dizisinden alabileceğimiz kadar alalım
        for (int i = 0; i < a.length && count < 2; i++) {
            result[count] = a[i];
            count++;
        }
        // Eğer hala yerimiz varsa (count < 2), B dizisinden tamamlayalım
        for (int i = 0; i < b.length && count < 2; i++) {
            result[count] = b[i];
            count++;
        }
        return result;
    }

    /*
    Neden üstteki kod "Senior" kodu?
    Hata Payı Yok: a.length 0 da olsa, 100 de olsa kod kırılmaz.
    Değişime Açık: Yarın "ilk 5 elemanı getir" deseler, sadece new int[5] ve count < 5 yapman yeterli. Alttaki kodda ise her şeyi silip baştan yazmak gerekirdi.
    Okunabilir: "Önce A'yı koy, yer varsa B'yi koy." Mantık cümlesi kadar net.
    */

    /*
    Alttaki şekilde de yazılabilir ama bu "Junior" kodudur.
    Alttaki Koddaki Temel Sorun: Kod "Durum Odaklı" (State Oriented) çalışıyor
    "A'nın boyu 2 ise ve B'nin boyu 0 ise şunu yap..."
    "A'nın boyu 1 ise ve B'nin boyu 1 ise bunu yap..." gibi.
    Bu yaklaşım, olasılıklar arttıkça (örneğin 3. bir C dizisi gelse) içinden çıkılmaz bir hal alır.
    Buna "Spaghetti Code" denir.
    Senior yaklaşım ise "Akış Odaklı" (Flow Oriented) çalışır:
    Elimde ne varsa sırayla sepete at, sepet dolunca dur." gibi.
     */
    public int[] make22(int[] a, int[] b) {
        int[] newArray = new int[2];
        if (a.length >= 2) {
            if (b.length > 0 && b.length < 2) {
                newArray[0] = a[0];
                newArray[1] = b[0];
            } else {
                newArray[0] = a[0];
                newArray[1] = a[1];
            }
            return newArray;
        }

        if (b.length >= 2) {
            if (a.length > 0 && a.length < 2) {
                newArray[0] = a[0];
                newArray[1] = b[0];
            } else {
                newArray[0] = b[0];
                newArray[1] = b[1];
            }
            return newArray;
        }

        if (a.length == 1 && b.length == 1) {
            newArray[0] = a[0];
            newArray[1] = b[0];
        }
        return newArray;
    }
}
