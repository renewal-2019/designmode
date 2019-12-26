package factory;

/**
 * 工厂接口类
 */
public interface BMWFactory {

    BMW productBMW();

}

/**
 * 3系工厂类
 */
class BMW3Factory implements BMWFactory {
    @Override
    public BMW productBMW() {
        System.out.println("生产3系");
        return new BMW3();
    }
}

/**
 * 5系工厂类
 */
class BMW5Factory implements BMWFactory {
    @Override
    public BMW productBMW() {
        System.out.println("生产5系");
        return new BMW5();
    }
}

/**
 * 7系工厂类
 */
class BMW7Factory implements BMWFactory {
    @Override
    public BMW productBMW() {
        System.out.println("生产7系");
        return new BMW7();
    }
}

