package proxy.dynamicproxy;

public class Animal implements Person{
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	@Override
	public void giveMoney() {
		
		System.out.println("我是动物" + name + ",吃掉50块粮食");
		
	}

}
