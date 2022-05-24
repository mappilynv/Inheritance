import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Part 1: Creating classes
//        A a = new A();
//        B b = new B();
//        C c = new C();
//
//        a.a();
//        b.b();
//        c.c();

        //Part 2: Class inheritance
//        C c = new C();
//
//        c.a();
//        c.b();
//        c.c();


        //Person and subclasses
        //Part 1: Person
//        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
//        System.out.println(ada);
//        System.out.println(esko);

        //Part 2: Student + Part 3: Student's toString
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        System.out.println("Study credits " + ollie.credits());
//        ollie.study();
//        System.out.println("Study credits "+ ollie.credits());

        //Part 3: Student's toString
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        ollie.study();
//        System.out.println(ollie);

        //Part 4: Teacher
//        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
//        System.out.println(ada);
//        System.out.println(esko);
//
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//
//        int i = 0;
//        while (i < 25) {
//            ollie.study();
//            i = i + 1;
//        }
//        System.out.println(ollie);

        //Part 5: List all Persons
//        ArrayList<Person> persons = new ArrayList<Person>();
//        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
//        printPersons(persons);


        //Part 1: Product warehouse, step 1
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // balance = 988.7, space left 11.3

    }

    //Part 5: List all Persons
//    public static void printPersons(ArrayList<Person> persons){
//        for(Person person: persons){
//            System.out.println(person);
//        }
//    }


}
