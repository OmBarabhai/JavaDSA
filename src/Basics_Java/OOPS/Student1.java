package Basics_Java.OOPS;

public class Student1 {
    public int rollNo;
    public int age;
    private String name;
    private int id;
    public Student1(Student1 srcObj){
        this.rollNo = srcObj.rollNo;
        this.name = srcObj.name;
        this.id = srcObj.id;
        this.age = srcObj.age;
    }
    public int setId(int id){

        return this.id = id;
    }
    public int getId(){
       return id;
    }
    public String getName(){
        return name;
    }
    Student1(){
        System.out.println("Default ctor");
    }
    Student1(int rollNo,String name, int age, int id){
        this.id = id;
        this.name =name;
        this.age = age;
        this.rollNo = rollNo;
        System.out.println("Parameterized Ctor");
    }

     public void sleep(){
        System.out.println(name+" Sleep");
    }
    public void eat(){
        System.out.println(name+" eat");
    }
    public void walk(){
        System.out.println(name+" Walk");
    }

}
