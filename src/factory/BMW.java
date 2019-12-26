package factory;

/**
 * 宝马车的接口类
 */
public interface BMW {

    void showInfo();

}

/**
 * 3系
 */
class BMW3 implements BMW{
    @Override
    public void showInfo() {
        System.out.println("BMW3耀夜版");
    }
}

/**
 * 五系车型
 */
class BMW5 implements BMW {
    @Override
    public void showInfo() {
        System.out.println("宝马5系无敌版");
    }
}

/**
 * 七系车型
 */
class BMW7 implements BMW {
    @Override
    public void showInfo() {
        System.out.println("宝马7系奢华版");
    }
}
