package cn.itcast.algorithm.sort;

public class Insertion {
    //对数组a中的元素进行排序
    public static void sort(Comparable[] a) {
        for (int i=0; i<=a.length-1; i++) {
            //插入排序是向前扫描已排序区域，找到比自己小的位置，所以 j-- 是必须的。
            //(倒数遍历已经排序的元素，所以是j--)
            for (int j=i; j>0; j--) {
                if (greater(a[j-1],a[j])) {
                    exch(a, j-1, j);
                } else {
                    break;
                }
            }

        }
    }

    //比较v元素是否大于w元素
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w)>0;
    }

    //数组元素i和j交换为位置
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
