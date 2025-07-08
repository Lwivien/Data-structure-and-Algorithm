package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Student;

public class ComparableTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setUsername("wei");
        s1.setAge(18);

        Student s2 = new Student();
        s2.setUsername("liu");
        s2.setAge(19);

        //声明了一个变量 max，它的类型是 Comparable 接口
        Comparable max = getMax(s1, s2);
        System.out.println(max);

    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        if (result>0) {
            return c1;
        } else {
            return c2;
        }
    }
}
