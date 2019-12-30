package proxy.staticproxy;

/**
 * proxyclass
 * Implement the Person interface and save a student entity so that
 * it can proxy student behavior
 * 代理模式最主要的就是有一个公共接口（Person），一个具体的类（Student），一个代理类（StudentsProxy）,
 * 代理类持有具体类的实例，代为执行具体类实例方法。上面说到，代理模式就是在访问实际对象时引入一定程度的间接性，
 * 因为这种间接性，可以附加多种用途。这里的间接性就是指不直接调用实际对象的方法，那么我们在代理过程中就可以加上一些其他用途。
 */
public class StudentsProxy implements Person {

    // student be proxyed
    private Student stu;

    // Note that the formal parameter type is the interface type.
    public StudentsProxy(Person stu) {
        // only proxy student class object
        if (stu.getClass() == Student.class) {
            this.stu = (Student) stu;
        }
    }

    @Override
    public void giveMoney() {

        stu.giveMoney();

    }

}
