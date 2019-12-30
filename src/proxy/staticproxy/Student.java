package proxy.staticproxy;

/**
 * student class
 * Can perform specific payment actions
 */
public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {

        System.out.println(name + " payed a fee of 50 yuan");

    }

}
