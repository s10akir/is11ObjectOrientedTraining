import java.util.ArrayList;

/**
 * @author Akira Shinohara
 * @since 2018.07.10
 */
public class MySample {
    public static void main(String[] args) {
        ArrayList<Person> anyone = new ArrayList<>();

        anyone.add(new Student("Alice", 16, "日本工学院専門学校"));
        anyone.add(new BusinessMan("Bob", 30, "株式会社Hoge"));

        for (int i = 0; i < anyone.size(); i++) {  // 古典的な配列に対するループ
            anyone.get(i).printProfile();
        }

        for (Person somebody: anyone) {  // forEach
            somebody.printProfile();
        }

        anyone.forEach(Person::printProfile);  // ラムダ式
    }
}


abstract class Person {
    String name;
    private int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void printProfile() {
        System.out.println("hoge");
    }
}


class Student extends Person {
    String name = "moja";
    String school;


    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }


    @Override
    void printProfile() {
        System.out.println(name + "さんは学生です。 " + school + "に通っています。");
    }
}


class BusinessMan extends Person{
    private String company;


    BusinessMan(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }


    @Override
    void printProfile() {
        System.out.println(name + "さんはビジネスマンです。 " + company + "で働いています。");
    }
}