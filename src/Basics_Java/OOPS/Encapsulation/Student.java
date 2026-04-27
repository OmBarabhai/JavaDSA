package Basics_Java.OOPS.Encapsulation;

public class Student {
    //Attributes/properties/data
    public int age;
    public int rollNo;
    /// encapsulation
    private String name;
    private int id;

    /// getter
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    /// setter
    public void setId(int id){
        /// extra layer of authentication
        if(id<30) this.id = id;
        else return;
    }

    //Default ctor // attr. -> garbage
    public Student(){
        System.out.println("This Ctor is Student Default Ctor Are Called");
    }
    //Parameterized Ctor
    public Student(int id,int age,String name,int rollNo){
        System.out.println("This Ctor is Student Parameterized Ctor Are Called");
        this.id = id;
        this.age = age;
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(Student srcobj){
        System.out.println("This Ctor is Student Copy Ctor Are Called");
        this.id = srcobj.id;
        this.age= srcobj.age;
        this.name = srcobj.name;
        this.rollNo = srcobj.rollNo;
    }

    //behaviours / methods / functions
    public void bunk(){
        System.out.println("Roll No. "+rollNo+" id is "+id+" Bunking name is "+name+" And Age is "+age);
    }
    public void study(){
        System.out.println("Roll No. "+rollNo+" id is "+id+" Studying name is "+name+" And Age is "+age);
    }
    public void eat(){
        System.out.println("Roll No. "+rollNo+" id is "+id+" eating name is "+name+" And Age is "+age);
    }
}
