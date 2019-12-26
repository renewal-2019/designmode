package singlemode.lazyman;

//线程不安全的懒汉设计模式
public class Person {

    //构造方法私有化
    private Person() {
    }

    //声明私有类变量
    private static Person person = null;

    public static Person getInstance() {

        if (person == null) {
            person = new Person();
        }

        return person;
    }

}
