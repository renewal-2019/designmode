package singlemode.lazyman;

/**
 * 利用静态内部类的初始化方式保证线程安全
 */
public class StaticSingleton {

    private StaticSingleton(){}

    private static class SingleHolder{
        private static StaticSingleton staticSingleton = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return SingleHolder.staticSingleton;
    }

}
