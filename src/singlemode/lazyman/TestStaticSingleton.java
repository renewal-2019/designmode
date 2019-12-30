package singlemode.lazyman;

public class TestStaticSingleton {

    public static void main(String[] args) {
        StaticSingleton s1 = StaticSingleton.getInstance();
        StaticSingleton s2 = StaticSingleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }

}
