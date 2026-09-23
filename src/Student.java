// Opgave 1
public class Student{
     String name;
     int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }
}

