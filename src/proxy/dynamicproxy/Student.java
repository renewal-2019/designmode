package proxy.dynamicproxy;

/**
 * student class Can perform specific payment actions
 * 
 * @author swiftzsl
 *
 */
public class Student implements Person {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void giveMoney() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " payed a fee of 50 yuan");

	}

}
