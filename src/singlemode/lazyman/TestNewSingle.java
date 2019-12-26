package singlemode.lazyman;

public class TestNewSingle {
    public static void main(String[] args) {
        Single single = Single.getInstance();

        Thread thread = new Thread(new ThreadLazy1());
        thread.start();

        System.out.println(single);
    }
}
