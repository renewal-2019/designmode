package singlemode.hungerman;

public class Test {

    public static void main(String[] args) {
        Person person = Person.getInstance();
        System.out.println(person);
        Person person2 = Person.getInstance();
        System.out.println(person2);
        Person person3 = Person.getInstance();
        System.out.println(person3);
    }

}
