package Basics_Java.OOPS;

public class App {
    public static void main(String[] args) {
        ///default ctor
//        Student A = new Student();
//        A.id = 1;
//        A.age = 22;
//        A.rollNo = 21;
//        A.name = "Om";
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.rollNo);
//
//        A.bunk();
//        A.eat();
//        A.study();
        ///Parameterized ctor
        Student B = new Student(2,22,"Om",21);
        /// encapsulation name Nd I'd
        ///System.out.println(B.name); // X private
        ///System.out.println(B.id);  // X private

        /// getter
        System.out.println("getter Name "+B.getName());
        System.out.println( "getter Id before Set "+B.getId());
        /// setter
        B.setId(9);
        System.out.println( "getter Id After set "+B.getId());
        B.setId(40);
        System.out.println( "getter Id After set "+B.getId());//extra layer of auth in setter check




        System.out.println(B.age);
        System.out.println(B.rollNo);
//        B.bunk();
//        B.eat();
//        B.study();

        ///Multiple Object creation
//        Student D = new Student(3,23,"Om",25);
//        Student E = new Student(4,23,"HariOm",26);
//        Student F = new Student(5,23,"Krushna",27);
//        Student G = new Student(6,23,"Sahil",28);


        /// Copy Ctor
//        Student C = new Student(B);
//        System.out.println(C.name);
//        System.out.println(C.id);
//        System.out.println(C.age);
//        System.out.println(C.rollNo);
//        C.eat();




    }
}
