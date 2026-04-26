package Basics_Java.OOPS;

public class App1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();

        Student1 s2 = new Student1(22,"rahul",21,44);
//        System.out.println(s2.name);
//        System.out.println(s2.id);
        s2.setId(30);
        System.out.println(s2.getId());
        s2.getName();

        Student1 s3 = new Student1(s2);
        System.out.println(s3.rollNo);
        System.out.println(s3.age);
        System.out.println(s3.getId());
        System.out.println(s3.setId(40));
        System.out.println(s3.getId());
        System.out.println(s3.getName());




    }
}
