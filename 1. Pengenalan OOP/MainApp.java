public class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Eko";
        person1.address = "Tegal";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Padepokan 79");

        Person person2 = new Person();
        person2.name = "Joko";
        person2.address = "Surabaya";

        person2.sayHello("Padepokan79");
        System.out.println(person2.sayAddress());

        //CONSTRUCTOR membuat object dari class Person menggunakan Constructor Parameter
        Person person3 = new Person("Eko","Jakarta");
        person3.sayHello("Padepokan 79");
        System.out.println(person3.sayAddress());
    }
}
