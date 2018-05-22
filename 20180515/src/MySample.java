public class MySample {

    public static void main(String[] args) {

        Person alice = new Person();
        alice.setProfile("Alice Green", 16);

        Person bob = new Person();
        bob.setProfile("Boby White", 45);

        alice.printProfile();
        bob.printProfile();

    }
}


class Person {

    String name;
    int age;

    void setProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printProfile() {
        System.out.println(name + "さんは" + age + "歳" + "です。");
    }

}