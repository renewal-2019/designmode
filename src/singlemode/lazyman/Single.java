package singlemode.lazyman;

/**
 * 线程安全的懒汉设计模式
 * 注意:对私有类变量要使用volatile关键字修饰,对全部线程可见
 * synchronized锁住的是整个类,而不是这个对象,否则报空指针异常
 */
public class Single {

    private Single(){}

    private volatile static Single single = null;

    public static Single getInstance(){
        if(single == null){
            synchronized (Single.class){
                if(single == null){
                    single = new Single();
                }
            }
        }

        return single;
    }

}
