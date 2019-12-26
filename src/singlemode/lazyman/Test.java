package singlemode.lazyman;

public class Test {

    public static void main(String[] args) {
        Person person = Person.getInstance();
        Person person2 = Person.getInstance();
        Person person3 = Person.getInstance();

        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);
    }

}
