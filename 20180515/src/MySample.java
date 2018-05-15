public class MySample {

    public static void main(String[] args) {

        Person alice = new Person();
        alice.setData("Alice Green", 16);

        Person bob = new Person();
        bob.setData("Boby White", 45);

        alice.printData();
        bob.printData();

    }
}


class Person {

    String name;
    int age;

    void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printData() {
        System.out.println(name + "さんは" + age + "歳" + "です。");
    }

}