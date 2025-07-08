package cn.itcast.algorithm.sort;

public class Bubble {
    //对数组a中的元素进行排序
    public static void sort(Comparable[] a) {
        //i>0而不是>=0-- 保证还有至少一对相邻元素可以进行比较。
        /*
        i 表示当前“未排好序部分”的 最后一个索引位置。
        (i 表示的是索引编号)
        每完成一轮冒泡，最大的元素就被“冒泡”到最后（a[i] 位置）。
        所以每轮比较的末尾会减少 → i 从 a.length - 1 逐渐减少到 1。
        */
        for (int i=a.length-1; i>0; i--) {
            //j 是当前比较的 前一个元素的位置，我们始终在比较 a[j] 和 a[j+1]。
            for (int j=0; j<i; j++) {
                if (greater(a[j], a[j+1])) {
                    exch(a, j, j+1);
                }
            }
        }
    }

    //比较v元素是否大于w元素
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w)>0;
    }

    //交换元素i和元素j的位置
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
