package cn.itcast.algorithm.sort;
//1.定义一个学生类Student，具有年龄age和姓名username两个属性，并通过Comparable接口提供比较规则；
public class Student implements Comparable<Student> {
    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }


    @Override
    public String toString() {
        return "Student{ " +
                "username = ' " + username + "\'" +
                ", age= " + age +
                '}'; //不能用"",要用单引号，双引号表示拼接字符串，单引号--符号


    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
