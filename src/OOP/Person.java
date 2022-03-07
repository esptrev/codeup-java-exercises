package OOP;

//public class Person {
//    public String firstName;
//    public String lastName;
//    public String sayHello(){
//        return String.format("Hello from %s %s", firstName, lastName);
//}
//
//    public static void main(String[] args) {
//        ///INSTANCE OF PERSON /// EACH INSTANCE CAN HAVE UNIQUE VALUES ///
//        Person trevor = new Person();
//        trevor.firstName = "Trevor";
//        trevor.lastName = "Esparza";
//
//
//        Person kristin = new Person();
//        kristin.firstName = "Kristin";
//        kristin.lastName = "Moran";
//
//        Person korbin = new Person();
//        korbin.firstName = "Korbin";
//        korbin.lastName = "Esparza";
//
//        System.out.println(kristin.sayHello());
//        System.out.println(korbin.sayHello());
//        System.out.println(trevor.sayHello());
//    }
//} /// END OF CLASS DO NOT DELETE ///


public class Person {
    private String firstName;


    public Person (String name) {
        setName(name); // or this.name = name; this way you dont lose any special formats

    }

    // returns the person's name
    public String getName(){
        return this.firstName;
    }
    // changes the name property to the passed value
    public void setName (String name){
        this.firstName = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello " + getName());
    }


    public static void main(String[] args) {
        Person trevor = new Person("Trevor");
        trevor.sayHello();
        System.out.println(trevor.getName());


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());







    }


} /// END OF CLASS ///
