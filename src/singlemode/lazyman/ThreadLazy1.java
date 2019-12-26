package singlemode.lazyman;

public class ThreadLazy1 implements Runnable{

    @Override
    public void run() {
        Single single = Single.getInstance();
        System.out.println(single + "线程");
    }
}
