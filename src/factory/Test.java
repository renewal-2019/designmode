package factory;

public class Test {

    public static void main(String[] args) {

        //需要哪类车就从哪类工厂里面去拿
        BMW m3 = new BMW3Factory().productBMW();
        m3.showInfo();

        // 通过5系工厂生产5系
        BMW m5 = new BMW5Factory().productBMW();
        m5.showInfo();

        // 通过3系工厂生产3系
        BMW m7 = new BMW7Factory().productBMW();
        m7.showInfo();
    }

}
