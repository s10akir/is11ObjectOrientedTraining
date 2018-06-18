public class MySample {
    public static void main(String[] args) {

        HaveToDo alice = new Student("Alice", 16, "日本工学院専門学校");
//        alice.printProfile();
        alice.printWorks();

        HaveToDo bob = new BusinessMan("Bob", 30, "株式会社ほげほげ");
//        bob.printProfile();
        bob.printWorks();
    }
}


interface HaveToDo {
    void printWorks();
}


abstract class Person implements HaveToDo{
    String name;
    private int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    abstract void printProfile();
    public abstract void printWorks();
}


class Student extends Person implements HaveToDo {
    private String school;
    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }


    void printProfile() {
        System.out.println(name + "さんは学生です。" + school + "に通っています。");
    }


    @Override
    public void printWorks() {
        System.out.println("学生なので勉強します。");
    }
}


class BusinessMan extends Person implements HaveToDo {
    private String company;


    BusinessMan(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }


    void printProfile() {
        System.out.println(name + "さんはビジネスマンです。" + company + "で働いています。");
    }


    @Override
    public void printWorks() {
        System.out.println("ビジネスマンなので仕事をします。");
    }
}