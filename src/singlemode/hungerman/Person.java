package singlemode.hungerman;

//恶汉设计模式
public class Person {

    //构造方法私有化
    private Person() {
    }

    //私有化变量
    private static Person person = new Person();

    public static Person getInstance(){
        return person;
    }

}
