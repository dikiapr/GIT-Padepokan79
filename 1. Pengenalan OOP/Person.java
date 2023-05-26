public class Person {
    String name, address;
    final String country = "Indonesia";

    //Constructor default
    Person(){

    }

    //Constructor dengan satu parameter
    Person(String paramName){
        name = paramName;
    }

    //Constructor dengan dua parameter menggunakan This agar tidak terjadi Variabel Shadowing
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", Myname is " + name + ".");
    }

    String sayAddress(){
     return "I, come from " + address + ".";
    }
}
